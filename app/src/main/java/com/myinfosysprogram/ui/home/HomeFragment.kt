package com.myinfosysprogram.ui.home

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.myinfosysprogram.R
import com.myinfosysprogram.adapter.ListDataAdapter
import com.myinfosysprogram.base.BaseFragment
import com.myinfosysprogram.constants.AppConstants
import com.myinfosysprogram.model.request.GeneralRequest
import com.myinfosysprogram.model.response.WeatherCurrentDayResponse
import com.myinfosysprogram.model.response.WeatherDailyResponse
import com.myinfosysprogram.model.response.WeatherResponse
import com.myinfosysprogram.retrofit.Resource
import com.myinfosysprogram.utils.*
import com.myinfosysprogram.viewModel.HomeCommunicatorViewModel
import com.myinfosysprogram.viewModel.ListViewModel
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.item_main_weather.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * A simple [HomeFragment] subclass as the default destination in the navigation.
 */
class HomeFragment : BaseFragment() {
    private lateinit var communicatorViewModel: HomeCommunicatorViewModel
    private val listViewModel: ListViewModel by viewModel()

    private lateinit var listObserver: Observer<Resource<WeatherResponse>>
    private lateinit var updateListObserver: Observer<String>
    private lateinit var locationObserver: Observer<Boolean>

    private lateinit var mAdapter: ListDataAdapter
    private var listRes: ArrayList<WeatherDailyResponse> = arrayListOf()

    private fun getLayoutId(): Int {
        return R.layout.fragment_home
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(getLayoutId(), container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
    }

    private fun initUI() {
        communicatorViewModel =
            ViewModelProvider(requireActivity()).get(HomeCommunicatorViewModel::class.java)
        communicatorViewModel.updateTitle(getString(R.string.hint_title))

        homeSwipeRefreshView.setOnRefreshListener {
            homeSwipeRefreshView.isRefreshing = false
            communicatorViewModel.checkLocationPermissioin(true)
        }

        progressBar.visibility = View.GONE
        noDataMsgTv.visibility = View.GONE
        initObserver()
        initAdapter()
    }

    private fun updateWeather() {
        if (verifyAvailableNetwork(requireContext(), homeParentLyt))
            getList()
        else {
            getRowsFromDB()
        }
    }

    /* method to communicate with view model to fetch the list from server */
    private fun getList() {
        if (communicatorViewModel.location == null) {
            noData()
        } else {
            progressBar.visibility = View.VISIBLE
            homeSwipeRefreshView.isRefreshing = false
            val request = GeneralRequest()
            listViewModel.getGeneralMutableRequest(request)
            listViewModel.getListResponse().observe(viewLifecycleOwner, listObserver)
        }
    }

    /* adapter is initialise to show data using RV*/
    private fun initAdapter() {
        mAdapter = ListDataAdapter(listRes, requireContext())
        homeRv.adapter = mAdapter
        CoroutineScope(Dispatchers.Main).launch {
            delay(500)
            // updateWeather()
        }
    }

    private fun setCurrentDateWeather(res: WeatherCurrentDayResponse) {
        tempTv.text = res.temp.toString()
        "${getString(R.string.hint_Feels_Like)}: ${res.feels_like}".also { feelsTv.text = it }
        "${getString(R.string.hint_updated)}: ${(getDateString(res.dt))}".also { dateTv.text = it }
        res.weather?.first()?.let {
            val imgPath = "${AppConstants.IMAGE_URL}${it.icon}${AppConstants.IMAGE_TYPE}"
            if (imgPath.isNotEmpty()) {
                if (context != null) {
                    Picasso.get()
                        .load(imgPath)
                        .placeholder(R.drawable.placeholder)
                        .error(R.drawable.placeholder)
                        .into(weatherIv)
                }
            }
        }
    }

    /* this fun defines the observer of the current view model used in fragment */
    private fun initObserver() {
        listObserver = Observer { it ->
            progressBar.visibility = View.GONE
            homeSwipeRefreshView.isRefreshing = false

            if (it.success && it.data != null) {
                val response: WeatherResponse? = it.data as? WeatherResponse

                if (listRes.isNotEmpty())
                    listRes.clear()

                if (response == null) {
                    noData()
                } else {
                    response.current?.let { it1 -> setCurrentDateWeather(it1) }
                    response.daily?.let { it2 -> listRes.addAll(it2.subList(2,6)) }

                    /* check DB work */
                    updateDataIntoTable(response)
                }
                mAdapter.notifyDataSetChanged()
                noDataMsgTv.visibility = if (listRes.isEmpty()) View.VISIBLE else View.GONE
            }
        }

        updateListObserver = Observer {
            val res = convertStringToJson(it)
            if (res != null) {
                if (listRes.isNotEmpty())
                    listRes.clear()

                res.current?.let { it1 -> setCurrentDateWeather(it1) }
                res.daily?.let { it2 -> listRes.addAll(it2.subList(2,6)) }
                mAdapter.notifyDataSetChanged()
            } else {
                noDataMsgTv.visibility = if (listRes.isEmpty()) View.VISIBLE else View.GONE
            }
        }

        listViewModel.updateListFromDBResponse().observe(
            viewLifecycleOwner,
            updateListObserver
        )

        locationObserver = Observer {
            if (it)
                updateWeather()
            else {
                noDataMsgTv.visibility = View.VISIBLE
                showAlartMsg(requireActivity())
            }
        }

        communicatorViewModel.locationUpdateMutableLiveData.observe(
            requireActivity(),
            locationObserver
        )
    }

    private fun getRowsFromDB() {
        listViewModel.getRowsData()
    }

    private fun updateDataIntoTable(response: WeatherResponse?) {
        val strRes = convertJsonToString(response)
        response?.let {
            listViewModel.updateDatabase(strRes)
        }
    }

    private fun noData() {
        showShackBarMsg(
            homeParentLyt,
            requireActivity().resources.getString(R.string.msg_no_data)
        )
        noDataMsgTv.visibility = View.VISIBLE
    }

    private fun showAlartMsg(activity: Activity) {
        var alertDialog: AlertDialog? = null

        val builder = AlertDialog.Builder(activity)
        builder.setTitle(R.string.app_name)
        builder.setMessage(R.string.no_location_permission)
        builder.setPositiveButton(getString(R.string.btn_yes)) { dialogInterface, which ->
            communicatorViewModel.checkLocationPermissioin(true)
            alertDialog?.dismiss()
        }
        builder.setNeutralButton(getString(R.string.Btn_cancel)) { dialogInterface, which ->
            noData()
            alertDialog?.dismiss()
        }
        alertDialog = builder.create()
        alertDialog.show()
    }
}
