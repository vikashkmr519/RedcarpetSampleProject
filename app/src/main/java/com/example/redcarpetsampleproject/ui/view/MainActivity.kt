package com.example.redcarpetsampleproject.ui.view

import android.icu.lang.UCharacter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.redcarpetsampleproject.R
import com.example.redcarpetsampleproject.data.api.Client
import com.example.redcarpetsampleproject.data.models.AllNews
import com.example.redcarpetsampleproject.data.models.Articles
import com.example.redcarpetsampleproject.ui.adapter.NewsAdapter
import com.example.redcarpetsampleproject.ui.viewmodel.NewsViewModel
import com.example.redcarpetsampleproject.utils.Country
import com.squareup.moshi.JsonAdapter
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {

    val vm by lazy {
        ViewModelProvider(this).get(NewsViewModel::class.java)
    }

    val list = arrayListOf<Articles>()
    val adapter = NewsAdapter(this,list)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vm.fetchNews()
        list.addAll(vm.list)

        newsRv.apply {
            layoutManager = LinearLayoutManager(this@MainActivity,RecyclerView.VERTICAL,false)
            adapter = this@MainActivity.adapter
        }


        }



    }
