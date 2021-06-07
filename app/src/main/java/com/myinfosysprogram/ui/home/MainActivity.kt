package com.myinfosysprogram.ui.home

import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import android.content.pm.PackageManager
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.core.app.ActivityCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.myinfosysprogram.R
import com.myinfosysprogram.base.BaseActivity
import com.myinfosysprogram.viewModel.HomeCommunicatorViewModel
import kotlinx.android.synthetic.main.activity_main.*

open class MainActivity : BaseActivity(), LocationListener {
    private lateinit var communicatorViewModel: HomeCommunicatorViewModel
    private lateinit var titleObserver: Observer<String>
    private lateinit var askPermissionObserver: Observer<Boolean>
    private var mainMenu: Menu? = null
    private var locationManager: LocationManager? = null


    companion object {
        private const val PERMISSION_REQUEST_ACCESS_FINE_LOCATION = 100
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun initUI() {
        communicatorViewModel = ViewModelProvider(this).get(HomeCommunicatorViewModel::class.java)
        setSupportActionBar(toolbar)
        manageToolbar(this.resources.getString(R.string.app_name))
        initObserver()

        locationManager = getSystemService(Context.LOCATION_SERVICE) as? LocationManager
        getLocation()
    }

    private fun initObserver() {
        titleObserver = Observer {
            if (it != null)
                manageToolbar(it)
        }
        communicatorViewModel.titleUpdateMutableLiveData.observe(this, titleObserver)

        askPermissionObserver = Observer {
            getLocation()
        }
        communicatorViewModel.askLocationPermissionMutableLiveData.observe(
            this,
            askPermissionObserver
        )
    }

    /* this fun is used to update the title of action bar*/
    private fun manageToolbar(title: String) {
        val actionBar = supportActionBar
        actionBar!!.title = title
        cacheDir
    }

    private fun manageMenu(status: Boolean = true) {
        mainMenu?.findItem(R.id.action_settings)?.isVisible = status

        if (status) {
            toolbar.navigationIcon = null
        } else {
            toolbar.setNavigationIcon(R.drawable.back)
        }

        toolbar.setNavigationOnClickListener {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        this.mainMenu = menu
        return false
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> {
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun getLocation() {
        if (ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_COARSE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(
                    Manifest.permission.ACCESS_FINE_LOCATION,
                    Manifest.permission.ACCESS_COARSE_LOCATION
                ),
                PERMISSION_REQUEST_ACCESS_FINE_LOCATION
            )
            return
        }
        getLastKnownLocation(this)
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == PERMISSION_REQUEST_ACCESS_FINE_LOCATION) {
            when (grantResults[0]) {
                PackageManager.PERMISSION_GRANTED -> getLocation()
                PackageManager.PERMISSION_DENIED -> communicatorViewModel.updateLocation(false)
            }
        }
    }

    override fun onLocationChanged(location: Location?) {
        communicatorViewModel.location = location
        communicatorViewModel.updateLocation(true)
        Log.e("LocationLat", "${location?.latitude}")
        Log.e("LocationLong", "${location?.longitude}")
    }

    override fun onStatusChanged(provider: String?, status: Int, extras: Bundle?) {

    }

    override fun onProviderEnabled(provider: String?) {

    }

    override fun onProviderDisabled(provider: String?) {
        communicatorViewModel.updateLocation(false)
    }

    @SuppressLint("MissingPermission")
    private fun getLastKnownLocation(context: Context) {
        val locationManager: LocationManager =
            context.getSystemService(Context.LOCATION_SERVICE) as LocationManager
        val providers: List<String> = locationManager.getProviders(true)
        var location: Location? = null
        for (i in providers.size - 1 downTo 0) {
            location = locationManager.getLastKnownLocation(providers[i])
            if (location != null)
                break
        }
        val gps = DoubleArray(2)
        if (location != null) {
            Log.e("gpsLat", gps[0].toString())
            Log.e("gpsLong", gps[1].toString())
            communicatorViewModel.location = location
            communicatorViewModel.updateLocation(true)
        }
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,0,0.1f,this)
        locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 0L, 0f, this)
    }
}

