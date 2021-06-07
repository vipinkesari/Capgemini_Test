package com.myinfosysprogram.repository

import androidx.lifecycle.LiveData
import com.myinfosysprogram.constants.AppConstants.Companion.API_KEY
import com.myinfosysprogram.constants.AppConstants.Companion.UNIT_OF_WEATHER
import com.myinfosysprogram.model.request.GeneralRequest
import com.myinfosysprogram.model.response.DBResponse
import com.myinfosysprogram.model.response.WeatherResponse
import com.myinfosysprogram.retrofit.ApiResponse
import com.myinfosysprogram.retrofit.NetworkBoundWtDbRes
import com.myinfosysprogram.retrofit.Resource
import com.myinfosysprogram.retrofit.RetrofitService
import com.myinfosysprogram.roomDb.RowsDao
import kotlinx.coroutines.*
import org.koin.dsl.module

val repositoryModule = module {
    factory {
        GeneralRepository(get(), get())
    }
}

open class GeneralRepository(private val apiService: RetrofitService, private val rowDao: RowsDao) :
    BaseRepository() {

    fun getWeatherListApi(request: GeneralRequest): LiveData<Resource<WeatherResponse>> {
        return object : NetworkBoundWtDbRes<WeatherResponse, WeatherResponse>(appExecutor) {
            override fun createCall(): LiveData<ApiResponse<WeatherResponse>> {
                return apiService.getWeather(
                    lat = request.location?.latitude?:0.0,
                    lon = request.location?.longitude?:0.0,
                    units = UNIT_OF_WEATHER,
                    appid = API_KEY
                )
            }
        }.asLiveData()
    }

    fun savePhotoData(response: String) {
        CoroutineScope(Dispatchers.IO).launch {
            rowDao.nukeTable()
            rowDao.insertRow(DBResponse(response))
        }
    }

    fun getRowsListFromDb(): DBResponse {
        return rowDao.getAllRows()?.first()
    }
}

