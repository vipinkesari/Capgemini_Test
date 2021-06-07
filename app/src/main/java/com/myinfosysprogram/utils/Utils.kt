package com.myinfosysprogram.utils

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import android.view.View
import com.google.android.material.snackbar.Snackbar
import com.google.gson.Gson
import com.myinfosysprogram.R
import com.myinfosysprogram.model.response.WeatherResponse
import java.text.SimpleDateFormat
import java.util.*


fun verifyAvailableNetwork(context: Context, view: View?): Boolean {
    val connectivityManager =
        context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

    if (Build.VERSION.SDK_INT < Build.VERSION_CODES.Q) {
        val networkInfo = connectivityManager.activeNetworkInfo
        val result = networkInfo != null && networkInfo.isConnected

        if (!result && view != null)
            showShackBarMsg(view, context.resources.getString(R.string.msg_no_internet))

        return result
    } else {
        val network = connectivityManager.allNetworks
        var hasNetwork = false

        if (network.isNotEmpty()) {
            for (item in network) {
                val networkCapabilities = connectivityManager.getNetworkCapabilities(item)
                if (networkCapabilities!!.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET))
                    hasNetwork = true
            }
        }

        if (!hasNetwork && view != null)
            showShackBarMsg(view, context.resources.getString(R.string.msg_no_internet))

        return hasNetwork
    }
}

fun showShackBarMsg(view: View, msg: String) {
    Snackbar.make(view, msg, Snackbar.LENGTH_LONG).show()
}

private val simpleDateFormat = SimpleDateFormat("dd MMMM yyyy, HH:mm:ss", Locale.ENGLISH)
fun getDateString(time: Long) : String = simpleDateFormat.format(time * 1000L)

fun convertJsonToString(response: WeatherResponse?): String {
    val gson = Gson()
    return gson.toJson(response)
}

fun convertStringToJson(res: String): WeatherResponse? {
    val gson = Gson()
    return gson.fromJson(res, WeatherResponse::class.java)
}


