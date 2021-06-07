package com.myinfosysprogram.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/myinfosysprogram/repository/GeneralRepository;", "Lcom/myinfosysprogram/repository/BaseRepository;", "apiService", "Lcom/myinfosysprogram/retrofit/RetrofitService;", "rowDao", "Lcom/myinfosysprogram/roomDb/RowsDao;", "(Lcom/myinfosysprogram/retrofit/RetrofitService;Lcom/myinfosysprogram/roomDb/RowsDao;)V", "getRowsListFromDb", "Lcom/myinfosysprogram/model/response/DBResponse;", "getWeatherListApi", "Landroidx/lifecycle/LiveData;", "Lcom/myinfosysprogram/retrofit/Resource;", "Lcom/myinfosysprogram/model/response/WeatherResponse;", "request", "Lcom/myinfosysprogram/model/request/GeneralRequest;", "savePhotoData", "", "response", "", "app_debug"})
public class GeneralRepository extends com.myinfosysprogram.repository.BaseRepository {
    private final com.myinfosysprogram.retrofit.RetrofitService apiService = null;
    private final com.myinfosysprogram.roomDb.RowsDao rowDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.myinfosysprogram.retrofit.Resource<com.myinfosysprogram.model.response.WeatherResponse>> getWeatherListApi(@org.jetbrains.annotations.NotNull()
    com.myinfosysprogram.model.request.GeneralRequest request) {
        return null;
    }
    
    public final void savePhotoData(@org.jetbrains.annotations.NotNull()
    java.lang.String response) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.myinfosysprogram.model.response.DBResponse getRowsListFromDb() {
        return null;
    }
    
    public GeneralRepository(@org.jetbrains.annotations.NotNull()
    com.myinfosysprogram.retrofit.RetrofitService apiService, @org.jetbrains.annotations.NotNull()
    com.myinfosysprogram.roomDb.RowsDao rowDao) {
        super();
    }
}