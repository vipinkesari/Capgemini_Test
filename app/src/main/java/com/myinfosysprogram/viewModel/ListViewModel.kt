package com.myinfosysprogram.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.myinfosysprogram.model.request.GeneralRequest
import com.myinfosysprogram.model.response.WeatherResponse
import com.myinfosysprogram.repository.GeneralRepository
import com.myinfosysprogram.retrofit.Resource
import org.koin.dsl.module

val listViewModelModule = module {
    factory { ListViewModel(get()) }
}

class ListViewModel(private val generalRepository: GeneralRepository) : ViewModel() {

    private var generalRequestMutableLiveData = MutableLiveData<GeneralRequest>()
    private var listResponseLiveData: LiveData<Resource<WeatherResponse>>
    private var listUpdateMutableLiveData = MutableLiveData<String>()

    init {
        listResponseLiveData = Transformations.switchMap(generalRequestMutableLiveData) { input ->
            if (input == null) {
                return@switchMap null //AbsentLiveData.create()
            } else
                return@switchMap generalRequestMutableLiveData.value?.let {
                    generalRepository.getWeatherListApi(
                        it
                    )
                }
        }
    }

    fun updateDatabase(list: String) {
        generalRepository.savePhotoData(list)
    }

    fun getRowsData() {
        val resDB = generalRepository.getRowsListFromDb()
        listUpdateMutableLiveData.value = resDB.response
    }

    fun getGeneralMutableRequest(request: GeneralRequest) {
        generalRequestMutableLiveData.value = (request)
    }

    fun getListResponse() = listResponseLiveData

    fun updateListFromDBResponse() = listUpdateMutableLiveData
}