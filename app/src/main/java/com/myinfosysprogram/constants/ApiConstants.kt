package com.myinfosysprogram.constants

class ApiConstants {

    companion object {
        const val ZERO_STATUS_CODE: Int = 0
        const val RESOURCE_ERROR_PARAMETER =  "0"
        const val RESOURCE_ERROR_TYPE = "0"

        // https://api.openweathermap.org/data/2.5/onecall?lat={lat}&lon={lon}&exclude={part}&appid={API key}

        const val BASE_URL ="https://api.openweathermap.org/data/2.5/"
        const val API_SEVEN_DAYS = "onecall"
        const val KEY_LAT ="lat"
        const val KEY_LON ="lon"
        const val KEY_APP_ID ="appid"
        const val KEY_UNIT="units"
    }
}