package com.sunasterisk.iflickr.data.api

import com.sunasterisk.iflickr.BuildConfig
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

interface ApiFactory {

    private val httpClient: OkHttpClient.Builder
        get() = OkHttpClient.Builder().addInterceptor { chain ->
            val original = chain.request()
            val httpUrl = original.url()
            val url = httpUrl.newBuilder()
                .addQueryParameter(ApiConstants.QUERY_API_KEY, BuildConfig.API_KEY)
                .addQueryParameter(ApiConstants.QUERY_FORMAT, ApiConstants.VALUE_JSON)
                .addQueryParameter(ApiConstants.QUERY_NO_JSON_CALLBACK, ApiConstants.VALUE_ANY)
                .build()

            val requestBuilder = original.newBuilder().url(url)
            val request = requestBuilder.build()
            chain.proceed(request)
        }

    fun <T> buildApi(
        baseUrl: String,
        restApi: Class<T>,
        client: OkHttpClient,
        converterFactory: GsonConverterFactory,
        callAdapterFactory: RxJava2CallAdapterFactory
    ): T = Retrofit.Builder().baseUrl(baseUrl)
        .addConverterFactory(converterFactory)
        .addCallAdapterFactory(callAdapterFactory)
        .client(httpClient.build())
        .build()
        .create(restApi)
}
