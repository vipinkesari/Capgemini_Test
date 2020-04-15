package com.myinfosysprogram.prefrences

import android.content.Context
import android.content.SharedPreferences
import com.myinfosysprogram.constants.AppConstants
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module


val prefModule = module {
    single { Prefrences(androidContext()) }
}

class Prefrences(context: Context) {
    private val preferences: SharedPreferences =
        context.getSharedPreferences(AppConstants.PREF_NAME, Context.MODE_PRIVATE)

    fun setStringData(key: String, value: String) {
        preferences.edit().putString(key, value).apply()
    }

    fun getStringData(key: String = ""): String {
        return preferences.getString(key, "") ?: ""
    }

    fun setBooleanData(key: String, shouldShow: Boolean) {
        preferences.edit().putBoolean(key, shouldShow).apply()
    }

    fun getBooleanData(key: String): Boolean {
        return preferences.getBoolean(key, false)
    }
}