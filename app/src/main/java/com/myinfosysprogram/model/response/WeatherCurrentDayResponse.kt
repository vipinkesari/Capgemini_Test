package com.myinfosysprogram.model.response


class WeatherCurrentDayResponse {
    var dt: Long = 0
    var sunrise: Long? = null
    var sunset: Long? = null
    var temp: Double? = null
    var feels_like: Double? = null
    var pressure: Int? = null
    var humidity: Int? = null
    var dew_point: Double? = null
    var uvi: Double? = null
    var clouds: Int? = null
    var visibility: Int? = null
    var wind_speed: Double? = null
    var wind_deg: Long? = null
    var wind_gust: Double? = null
    var weather: List<WeatherRows>? = null
}