package com.myinfosysprogram.model.response


class WeatherResponse {
    var lat: Double = 0.0
    var lon: Double = 0.0
    var timezone: String = ""
    var timezone_offset: Long = 0
    var current: WeatherCurrentDayResponse? = null
    var daily: List<WeatherDailyResponse>? = null
}