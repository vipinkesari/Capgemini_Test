package com.myinfosysprogram.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0003J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0002J\b\u0010\u0016\u001a\u00020\u0010H\u0002J\b\u0010\u0017\u001a\u00020\u0010H\u0016J\u0012\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u0006H\u0002J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u000eH\u0002J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\fH\u0016J\u0012\u0010\u001e\u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020#H\u0016J\u0012\u0010$\u001a\u00020\u00102\b\u0010%\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010&\u001a\u00020\u00102\b\u0010%\u001a\u0004\u0018\u00010\u000eH\u0016J-\u0010\'\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u00142\u000e\u0010)\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0*2\u0006\u0010+\u001a\u00020,H\u0016\u00a2\u0006\u0002\u0010-J$\u0010.\u001a\u00020\u00102\b\u0010%\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0019\u001a\u00020\u00142\b\u0010/\u001a\u0004\u0018\u000100H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcom/myinfosysprogram/ui/home/MainActivity;", "Lcom/myinfosysprogram/base/BaseActivity;", "Landroid/location/LocationListener;", "()V", "askPermissionObserver", "Landroidx/lifecycle/Observer;", "", "communicatorViewModel", "Lcom/myinfosysprogram/viewModel/HomeCommunicatorViewModel;", "locationManager", "Landroid/location/LocationManager;", "mainMenu", "Landroid/view/Menu;", "titleObserver", "", "getLastKnownLocation", "", "context", "Landroid/content/Context;", "getLayoutId", "", "getLocation", "initObserver", "initUI", "manageMenu", "status", "manageToolbar", "title", "onCreateOptionsMenu", "menu", "onLocationChanged", "location", "Landroid/location/Location;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onProviderDisabled", "provider", "onProviderEnabled", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onStatusChanged", "extras", "Landroid/os/Bundle;", "Companion", "app_debug"})
public class MainActivity extends com.myinfosysprogram.base.BaseActivity implements android.location.LocationListener {
    private com.myinfosysprogram.viewModel.HomeCommunicatorViewModel communicatorViewModel;
    private androidx.lifecycle.Observer<java.lang.String> titleObserver;
    private androidx.lifecycle.Observer<java.lang.Boolean> askPermissionObserver;
    private android.view.Menu mainMenu;
    private android.location.LocationManager locationManager;
    private static final int PERMISSION_REQUEST_ACCESS_FINE_LOCATION = 100;
    @org.jetbrains.annotations.NotNull()
    public static final com.myinfosysprogram.ui.home.MainActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @java.lang.Override()
    public void initUI() {
    }
    
    private final void initObserver() {
    }
    
    private final void manageToolbar(java.lang.String title) {
    }
    
    private final void manageMenu(boolean status) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void getLocation() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    public void onLocationChanged(@org.jetbrains.annotations.Nullable()
    android.location.Location location) {
    }
    
    @java.lang.Override()
    public void onStatusChanged(@org.jetbrains.annotations.Nullable()
    java.lang.String provider, int status, @org.jetbrains.annotations.Nullable()
    android.os.Bundle extras) {
    }
    
    @java.lang.Override()
    public void onProviderEnabled(@org.jetbrains.annotations.Nullable()
    java.lang.String provider) {
    }
    
    @java.lang.Override()
    public void onProviderDisabled(@org.jetbrains.annotations.Nullable()
    java.lang.String provider) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void getLastKnownLocation(android.content.Context context) {
    }
    
    public MainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/myinfosysprogram/ui/home/MainActivity$Companion;", "", "()V", "PERMISSION_REQUEST_ACCESS_FINE_LOCATION", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}