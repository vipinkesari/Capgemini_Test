package com.myinfosysprogram.viewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0005J\u000e\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0005J\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0014R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\t\u00a8\u0006\u001d"}, d2 = {"Lcom/myinfosysprogram/viewModel/HomeCommunicatorViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "askLocationPermissionMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getAskLocationPermissionMutableLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setAskLocationPermissionMutableLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "location", "Landroid/location/Location;", "getLocation", "()Landroid/location/Location;", "setLocation", "(Landroid/location/Location;)V", "locationUpdateMutableLiveData", "getLocationUpdateMutableLiveData", "setLocationUpdateMutableLiveData", "titleUpdateMutableLiveData", "", "getTitleUpdateMutableLiveData", "setTitleUpdateMutableLiveData", "checkLocationPermissioin", "", "status", "updateLocation", "updateTitle", "str", "app_debug"})
public final class HomeCommunicatorViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> titleUpdateMutableLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> locationUpdateMutableLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> askLocationPermissionMutableLiveData;
    @org.jetbrains.annotations.Nullable()
    private android.location.Location location;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getTitleUpdateMutableLiveData() {
        return null;
    }
    
    public final void setTitleUpdateMutableLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLocationUpdateMutableLiveData() {
        return null;
    }
    
    public final void setLocationUpdateMutableLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getAskLocationPermissionMutableLiveData() {
        return null;
    }
    
    public final void setAskLocationPermissionMutableLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.location.Location getLocation() {
        return null;
    }
    
    public final void setLocation(@org.jetbrains.annotations.Nullable()
    android.location.Location p0) {
    }
    
    public final void updateTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String str) {
    }
    
    public final void updateLocation(boolean status) {
    }
    
    public final void checkLocationPermissioin(boolean status) {
    }
    
    public HomeCommunicatorViewModel() {
        super();
    }
}