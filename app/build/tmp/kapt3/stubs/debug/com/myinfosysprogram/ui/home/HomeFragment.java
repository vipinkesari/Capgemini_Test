package com.myinfosysprogram.ui.home;

import java.lang.System;

/**
 * A simple [HomeFragment] subclass as the default destination in the navigation.
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0002J\b\u0010\u001e\u001a\u00020\u001cH\u0002J\b\u0010\u001f\u001a\u00020\u001cH\u0002J\b\u0010 \u001a\u00020\u001cH\u0002J\b\u0010!\u001a\u00020\u001cH\u0002J&\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u001a\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020#2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0010\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020.H\u0002J\u0010\u0010/\u001a\u00020\u001c2\u0006\u00100\u001a\u000201H\u0002J\u0012\u00102\u001a\u00020\u001c2\b\u00103\u001a\u0004\u0018\u00010\bH\u0002J\b\u00104\u001a\u00020\u001cH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lcom/myinfosysprogram/ui/home/HomeFragment;", "Lcom/myinfosysprogram/base/BaseFragment;", "()V", "communicatorViewModel", "Lcom/myinfosysprogram/viewModel/HomeCommunicatorViewModel;", "listObserver", "Landroidx/lifecycle/Observer;", "Lcom/myinfosysprogram/retrofit/Resource;", "Lcom/myinfosysprogram/model/response/WeatherResponse;", "listRes", "Ljava/util/ArrayList;", "Lcom/myinfosysprogram/model/response/WeatherDailyResponse;", "Lkotlin/collections/ArrayList;", "listViewModel", "Lcom/myinfosysprogram/viewModel/ListViewModel;", "getListViewModel", "()Lcom/myinfosysprogram/viewModel/ListViewModel;", "listViewModel$delegate", "Lkotlin/Lazy;", "locationObserver", "", "mAdapter", "Lcom/myinfosysprogram/adapter/ListDataAdapter;", "updateListObserver", "", "getLayoutId", "", "getList", "", "getRowsFromDB", "initAdapter", "initObserver", "initUI", "noData", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setCurrentDateWeather", "res", "Lcom/myinfosysprogram/model/response/WeatherCurrentDayResponse;", "showAlartMsg", "activity", "Landroid/app/Activity;", "updateDataIntoTable", "response", "updateWeather", "app_debug"})
public final class HomeFragment extends com.myinfosysprogram.base.BaseFragment {
    private com.myinfosysprogram.viewModel.HomeCommunicatorViewModel communicatorViewModel;
    private final kotlin.Lazy listViewModel$delegate = null;
    private androidx.lifecycle.Observer<com.myinfosysprogram.retrofit.Resource<com.myinfosysprogram.model.response.WeatherResponse>> listObserver;
    private androidx.lifecycle.Observer<java.lang.String> updateListObserver;
    private androidx.lifecycle.Observer<java.lang.Boolean> locationObserver;
    private com.myinfosysprogram.adapter.ListDataAdapter mAdapter;
    private java.util.ArrayList<com.myinfosysprogram.model.response.WeatherDailyResponse> listRes;
    private java.util.HashMap _$_findViewCache;
    
    private final com.myinfosysprogram.viewModel.ListViewModel getListViewModel() {
        return null;
    }
    
    private final int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initUI() {
    }
    
    private final void updateWeather() {
    }
    
    private final void getList() {
    }
    
    private final void initAdapter() {
    }
    
    private final void setCurrentDateWeather(com.myinfosysprogram.model.response.WeatherCurrentDayResponse res) {
    }
    
    private final void initObserver() {
    }
    
    private final void getRowsFromDB() {
    }
    
    private final void updateDataIntoTable(com.myinfosysprogram.model.response.WeatherResponse response) {
    }
    
    private final void noData() {
    }
    
    private final void showAlartMsg(android.app.Activity activity) {
    }
    
    public HomeFragment() {
        super();
    }
}