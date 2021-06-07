package com.myinfosysprogram.model.response


class WeatherDailyResponse {
    var dt: Long = 0
    var sunrise: Long? = null
    var sunset: Long? = null
    var moonrise: Long? = null
    var moonset: Long? = null
    var moon_phase: Double? = null
    var temp: TempsRows? = null
    var feels_like: FeelsLikeRows? = null
    var pressure: Int? = null
    var humidity: Int? = null
    var dew_point: Double? = null
    var wind_speed: Double? = null
    var wind_deg: Long? = null
    var wind_gust: Double? = null
    var clouds: Int? = null
    var pop: Double? = null
    var uvi: Double? = null
    var weather: List<WeatherRows>? = null
}