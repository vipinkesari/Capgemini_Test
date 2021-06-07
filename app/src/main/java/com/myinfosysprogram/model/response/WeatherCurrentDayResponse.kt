package com.myinfosysprogram.model.response


class WeatherDailyResponse {
    var dt: Long = 0
    var sunrise: Long = 0
    var sunset: Long = 0
    var moonrise: Long = 0
    var moonset: Long = 0
    var moon_phase: Double = 0.0
    var temp: TempsRows? = null
    var feels_like: FeelsLikeRows? = null
    var pressure: Int = 0
    var humidity: Int = 0
    var dew_point: Double = 0.0
    var wind_speed: Double = 0.0
    var wind_deg: Long = 0
    var wind_gust: Double = 0.0
    var clouds: Int = 0
    var pop: Int = 0
    var uvi: Int = 0
    var weather: List<WeatherRows>? = null
}