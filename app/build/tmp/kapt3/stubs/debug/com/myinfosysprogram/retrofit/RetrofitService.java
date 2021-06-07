package com.myinfosysprogram.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J<\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\nH\'\u00a8\u0006\f"}, d2 = {"Lcom/myinfosysprogram/retrofit/RetrofitService;", "", "getWeather", "Landroidx/lifecycle/LiveData;", "Lcom/myinfosysprogram/retrofit/ApiResponse;", "Lcom/myinfosysprogram/model/response/WeatherResponse;", "lat", "", "lon", "units", "", "appid", "app_debug"})
public abstract interface RetrofitService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "onecall")
    public abstract androidx.lifecycle.LiveData<com.myinfosysprogram.retrofit.ApiResponse<com.myinfosysprogram.model.response.WeatherResponse>> getWeather(@retrofit2.http.Query(value = "lat")
    double lat, @retrofit2.http.Query(value = "lon")
    double lon, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "units")
    java.lang.String units, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "appid")
    java.lang.String appid);
}