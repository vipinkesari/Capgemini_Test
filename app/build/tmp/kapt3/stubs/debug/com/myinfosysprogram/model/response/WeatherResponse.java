package com.myinfosysprogram.model.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$\u00a8\u0006%"}, d2 = {"Lcom/myinfosysprogram/model/response/WeatherResponse;", "", "()V", "current", "Lcom/myinfosysprogram/model/response/WeatherCurrentDayResponse;", "getCurrent", "()Lcom/myinfosysprogram/model/response/WeatherCurrentDayResponse;", "setCurrent", "(Lcom/myinfosysprogram/model/response/WeatherCurrentDayResponse;)V", "daily", "", "Lcom/myinfosysprogram/model/response/WeatherDailyResponse;", "getDaily", "()Ljava/util/List;", "setDaily", "(Ljava/util/List;)V", "lat", "", "getLat", "()D", "setLat", "(D)V", "lon", "getLon", "setLon", "timezone", "", "getTimezone", "()Ljava/lang/String;", "setTimezone", "(Ljava/lang/String;)V", "timezone_offset", "", "getTimezone_offset", "()J", "setTimezone_offset", "(J)V", "app_debug"})
public final class WeatherResponse {
    private double lat = 0.0;
    private double lon = 0.0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String timezone = "";
    private long timezone_offset = 0L;
    @org.jetbrains.annotations.Nullable()
    private com.myinfosysprogram.model.response.WeatherCurrentDayResponse current;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.myinfosysprogram.model.response.WeatherDailyResponse> daily;
    
    public final double getLat() {
        return 0.0;
    }
    
    public final void setLat(double p0) {
    }
    
    public final double getLon() {
        return 0.0;
    }
    
    public final void setLon(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimezone() {
        return null;
    }
    
    public final void setTimezone(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long getTimezone_offset() {
        return 0L;
    }
    
    public final void setTimezone_offset(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.myinfosysprogram.model.response.WeatherCurrentDayResponse getCurrent() {
        return null;
    }
    
    public final void setCurrent(@org.jetbrains.annotations.Nullable()
    com.myinfosysprogram.model.response.WeatherCurrentDayResponse p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.myinfosysprogram.model.response.WeatherDailyResponse> getDaily() {
        return null;
    }
    
    public final void setDaily(@org.jetbrains.annotations.Nullable()
    java.util.List<com.myinfosysprogram.model.response.WeatherDailyResponse> p0) {
    }
    
    public WeatherResponse() {
        super();
    }
}