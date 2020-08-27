package com.example.redcarpetsampleproject.data.api


import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.moshi.MoshiConverterFactory


object Client {

//    private val moshi : Moshi = Moshi.Builder()
//        .add(KotlinJsonAdapterFactory())
//        .build()
    private val moshi : Moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

//    private val gson = GsonBuilder()
//        .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_DASHES)
//        .create()

    private val retrofit = Retrofit.Builder()
        .baseUrl("http://newsapi.org/")
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .build()


    val api = retrofit.create(NewsService::class.java)
}