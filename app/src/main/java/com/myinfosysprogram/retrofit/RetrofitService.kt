package com.myinfosysprogram.retrofit

import androidx.lifecycle.LiveData
import com.myinfosysprogram.constants.ApiConstants
import com.myinfosysprogram.constants.ApiConstants.Companion.KEY_APP_ID
import com.myinfosysprogram.constants.ApiConstants.Companion.KEY_LAT
import com.myinfosysprogram.constants.ApiConstants.Companion.KEY_LON
import com.myinfosysprogram.constants.ApiConstants.Companion.KEY_UNIT
import com.myinfosysprogram.model.response.WeatherResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitService {

    @GET(ApiConstants.API_SEVEN_DAYS)
    fun getWeather(
        @Query(KEY_LAT) lat: Double,
        @Query(KEY_LON) lon: Double,
        @Query(KEY_UNIT) units: String,
        @Query(KEY_APP_ID) appid: String
    ): LiveData<ApiResponse<WeatherResponse>>
}