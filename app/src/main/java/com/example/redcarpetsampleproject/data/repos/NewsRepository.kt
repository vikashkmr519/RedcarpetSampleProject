package com.example.redcarpetsampleproject.data.repos

import com.example.redcarpetsampleproject.data.api.Client
import com.example.redcarpetsampleproject.utils.Country

object NewsRepository {



    suspend fun getNews() = Client.api.getNews()
}