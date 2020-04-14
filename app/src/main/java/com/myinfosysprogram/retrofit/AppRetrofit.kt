package com.myinfosysprogram.retrofit

import com.google.gson.GsonBuilder
import com.myinfosysprogram.BuildConfig
import com.myinfosysprogram.MyApplication
import com.myinfosysprogram.constants.ApiConstants.Companion.BASE_URL
import com.myinfosysprogram.utils.verifyAvailableNetwork
import okhttp3.Cache
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.File
import java.io.IOException
import java.lang.reflect.Modifier
import java.net.HttpURLConnection
import java.util.concurrent.TimeUnit

object AppRetrofit {

    lateinit var mInstance: RetrofitService
    private const val TIMEOUT = 30.toLong()

    init {
        mInstance =  makeRetrofitService()
    }

    fun getInstance(): RetrofitService {
        if (mInstance == null)
            mInstance =
                makeRetrofitService();
        return mInstance
    }

    private  fun makeRetrofitService(): RetrofitService {

        val mBaseUrl = BASE_URL
        val cacheSize = (5*12024*104).toLong()
        val myCache = Cache(MyApplication.getAppContext().cacheDir, cacheSize)

        val headerInterceptor: Interceptor = object : Interceptor {
            @Throws(IOException::class)
            override fun intercept(chain: Interceptor.Chain): Response {

                /* for cache result */
                var request = chain.request().newBuilder()
                request = if (verifyAvailableNetwork(MyApplication.getAppContext(), null))
                    request.header("Cache-Control", "public, max-age=" + 5)
                else
                    request.header("Cache-Control", "public, only-if-cached, max-stale=" + 60 * 60 * 24 * 7)

                request.addHeader("Authorization", "authKey")
                var response = chain.proceed(request.build())

                /* for non cache */
                //val builder = chain.request().newBuilder()
                //builder.addHeader("Content-Type", "application/x-www-form-urlencoded");
                //builder.addHeader("Authorization", "authKey")
                //var response = chain.proceed(builder.build())

                /* check for forbidden */
                if (isForbidden(response.code)) {
                    var newRequest = chain.request()
                    newRequest = newRequest.newBuilder()
                        .addHeader("Authorization", "authKey")
                        .build()
                    response = chain.proceed(newRequest)
                }
                return response
            }
        }
        val httpClient = OkHttpClient().newBuilder()
            .cache(myCache)
            //.addInterceptor(LastFmRequestInterceptor(apiKey, cacheDuration))
            .addInterceptor(headerInterceptor)
            .addInterceptor(HttpLoggingInterceptor().apply {
                level =
                    if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY
                    else HttpLoggingInterceptor.Level.NONE
            })
            .connectTimeout(TIMEOUT, TimeUnit.SECONDS)
            .readTimeout(TIMEOUT, TimeUnit.SECONDS)
            .build()


        val retrofit = Retrofit.Builder()
            .baseUrl(mBaseUrl)
            .client(httpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .addConverterFactory(GsonConverterFactory.create(
                GsonBuilder()
                .excludeFieldsWithModifiers(Modifier.FINAL, Modifier.TRANSIENT, Modifier.STATIC).create()))
            .addCallAdapterFactory(LiveDataCallAdapterFactory())
            .build()

        return retrofit.create(RetrofitService::class.java)
    }

    private fun isForbidden(code: Int): Boolean {
        return code == HttpURLConnection.HTTP_FORBIDDEN
    }
}