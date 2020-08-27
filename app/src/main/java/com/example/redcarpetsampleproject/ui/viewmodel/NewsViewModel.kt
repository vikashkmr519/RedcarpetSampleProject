package com.example.redcarpetsampleproject.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.redcarpetsampleproject.data.models.AllNews
import com.example.redcarpetsampleproject.data.models.Articles
import com.example.redcarpetsampleproject.data.repos.NewsRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.security.auth.callback.Callback

class NewsViewModel : ViewModel() {
    val list = mutableListOf<Articles>()

    fun fetchNews() {
        viewModelScope.launch {
            val response = withContext(Dispatchers.IO) { NewsRepository.getNews() }

            if(response.isSuccessful){

                response.let {
                    list.addAll(it.body()?.articles!!)
                }
            }

        }
    }

}







