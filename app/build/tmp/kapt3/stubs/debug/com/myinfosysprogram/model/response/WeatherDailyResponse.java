package com.myinfosysprogram.model.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR\u001e\u0010 \u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b!\u0010\r\"\u0004\b\"\u0010\u000fR\u001e\u0010#\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010(\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001e\u0010)\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010(\u001a\u0004\b*\u0010%\"\u0004\b+\u0010\'R\u001e\u0010,\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b-\u0010\r\"\u0004\b.\u0010\u000fR\u001e\u0010/\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\bR\u001e\u00102\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010(\u001a\u0004\b3\u0010%\"\u0004\b4\u0010\'R\u001e\u00105\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010(\u001a\u0004\b6\u0010%\"\u0004\b7\u0010\'R\u001c\u00108\u001a\u0004\u0018\u000109X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001e\u0010>\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b?\u0010\r\"\u0004\b@\u0010\u000fR\"\u0010A\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001e\u0010H\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010(\u001a\u0004\bI\u0010%\"\u0004\bJ\u0010\'R\u001e\u0010K\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\bL\u0010\r\"\u0004\bM\u0010\u000fR\u001e\u0010N\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\bO\u0010\r\"\u0004\bP\u0010\u000f\u00a8\u0006Q"}, d2 = {"Lcom/myinfosysprogram/model/response/WeatherDailyResponse;", "", "()V", "clouds", "", "getClouds", "()Ljava/lang/Integer;", "setClouds", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "dew_point", "", "getDew_point", "()Ljava/lang/Double;", "setDew_point", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "dt", "", "getDt", "()J", "setDt", "(J)V", "feels_like", "Lcom/myinfosysprogram/model/response/FeelsLikeRows;", "getFeels_like", "()Lcom/myinfosysprogram/model/response/FeelsLikeRows;", "setFeels_like", "(Lcom/myinfosysprogram/model/response/FeelsLikeRows;)V", "humidity", "getHumidity", "setHumidity", "moon_phase", "getMoon_phase", "setMoon_phase", "moonrise", "getMoonrise", "()Ljava/lang/Long;", "setMoonrise", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "moonset", "getMoonset", "setMoonset", "pop", "getPop", "setPop", "pressure", "getPressure", "setPressure", "sunrise", "getSunrise", "setSunrise", "sunset", "getSunset", "setSunset", "temp", "Lcom/myinfosysprogram/model/response/TempsRows;", "getTemp", "()Lcom/myinfosysprogram/model/response/TempsRows;", "setTemp", "(Lcom/myinfosysprogram/model/response/TempsRows;)V", "uvi", "getUvi", "setUvi", "weather", "", "Lcom/myinfosysprogram/model/response/WeatherRows;", "getWeather", "()Ljava/util/List;", "setWeather", "(Ljava/util/List;)V", "wind_deg", "getWind_deg", "setWind_deg", "wind_gust", "getWind_gust", "setWind_gust", "wind_speed", "getWind_speed", "setWind_speed", "app_debug"})
public final class WeatherDailyResponse {
    private long dt = 0L;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long sunrise;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long sunset;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long moonrise;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long moonset;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double moon_phase;
    @org.jetbrains.annotations.Nullable()
    private com.myinfosysprogram.model.response.TempsRows temp;
    @org.jetbrains.annotations.Nullable()
    private com.myinfosysprogram.model.response.FeelsLikeRows feels_like;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer pressure;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer humidity;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double dew_point;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double wind_speed;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long wind_deg;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double wind_gust;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer clouds;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double pop;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double uvi;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.myinfosysprogram.model.response.WeatherRows> weather;
    
    public final long getDt() {
        return 0L;
    }
    
    public final void setDt(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getSunrise() {
        return null;
    }
    
    public final void setSunrise(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getSunset() {
        return null;
    }
    
    public final void setSunset(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getMoonrise() {
        return null;
    }
    
    public final void setMoonrise(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getMoonset() {
        return null;
    }
    
    public final void setMoonset(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getMoon_phase() {
        return null;
    }
    
    public final void setMoon_phase(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.myinfosysprogram.model.response.TempsRows getTemp() {
        return null;
    }
    
    public final void setTemp(@org.jetbrains.annotations.Nullable()
    com.myinfosysprogram.model.response.TempsRows p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.myinfosysprogram.model.response.FeelsLikeRows getFeels_like() {
        return null;
    }
    
    public final void setFeels_like(@org.jetbrains.annotations.Nullable()
    com.myinfosysprogram.model.response.FeelsLikeRows p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPressure() {
        return null;
    }
    
    public final void setPressure(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getHumidity() {
        return null;
    }
    
    public final void setHumidity(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getDew_point() {
        return null;
    }
    
    public final void setDew_point(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getWind_speed() {
        return null;
    }
    
    public final void setWind_speed(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getWind_deg() {
        return null;
    }
    
    public final void setWind_deg(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getWind_gust() {
        return null;
    }
    
    public final void setWind_gust(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getClouds() {
        return null;
    }
    
    public final void setClouds(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPop() {
        return null;
    }
    
    public final void setPop(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getUvi() {
        return null;
    }
    
    public final void setUvi(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.myinfosysprogram.model.response.WeatherRows> getWeather() {
        return null;
    }
    
    public final void setWeather(@org.jetbrains.annotations.Nullable()
    java.util.List<com.myinfosysprogram.model.response.WeatherRows> p0) {
    }
    
    public WeatherDailyResponse() {
        super();
    }
}