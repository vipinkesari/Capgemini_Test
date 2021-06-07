package com.myinfosysprogram.viewModel

import android.location.Location
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeCommunicatorViewModel : ViewModel() {

    var titleUpdateMutableLiveData = MutableLiveData<String>()
    var locationUpdateMutableLiveData = MutableLiveData<Boolean>()
    var askLocationPermissionMutableLiveData = MutableLiveData<Boolean>()
    var location: Location? = null

    fun updateTitle(str: String) {
        titleUpdateMutableLiveData.postValue(str)
    }

    fun updateLocation(status : Boolean) {
        locationUpdateMutableLiveData.postValue(status)
    }

    fun checkLocationPermissioin(status : Boolean) {
        askLocationPermissionMutableLiveData.postValue(status)
    }
}