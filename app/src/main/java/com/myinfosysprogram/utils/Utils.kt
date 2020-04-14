package com.myinfosysprogram.utils

import android.app.Activity
import android.content.Context
import android.net.ConnectivityManager
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.myinfosysprogram.R


fun verifyAvailableNetwork(context: Context, view: View?): Boolean {
    val connectivityManager =
        context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    val networkInfo = connectivityManager.activeNetworkInfo
    var result = networkInfo != null && networkInfo.isConnected

    if (!result && view != null) {
        showShackBarMsg(view, context.resources.getString(R.string.msg_no_internet))
    }
    return result;
}

fun showShackBarMsg(view: View, msg: String) {
    Snackbar.make(view, msg, Snackbar.LENGTH_LONG).show()
}

fun showToastMsg(activity: Activity, msg: String) {
    Toast.makeText(activity, msg, Toast.LENGTH_LONG).show()
}
