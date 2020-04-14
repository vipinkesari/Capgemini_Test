package com.myinfosysprogram

import android.app.Application
import android.content.Context

/* application class contains all application level data*/
class MyApplication : Application(){

    companion object {
        lateinit var context: Context

        fun getAppContext(): Context {
            return context
        }
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }


}