package com.example.redcarpetsampleproject.data.api

import com.example.redcarpetsampleproject.data.models.AllNews
import com.example.redcarpetsampleproject.data.models.Articles
import kotlinx.coroutines.Deferred
import retrofit2.Call

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsService {

    @GET("v2/sources?apiKey=addaf8909c1f4965adb46e24577928f0")
    suspend fun getNews() : Response<AllNews>


}