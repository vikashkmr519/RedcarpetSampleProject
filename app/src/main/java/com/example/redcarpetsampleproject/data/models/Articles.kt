package com.example.redcarpetsampleproject.data.models

import com.google.gson.annotations.SerializedName
import com.squareup.moshi.Json
import javax.xml.transform.Source

data class Articles (


    val source: Source? = null,


    val author: String? = null,

    val title:String? = null,

    val description: String? = null,


    val url :String?= null,

    @SerializedName("url_to_image")
    val urlToImage : String?= null,

    @SerializedName("published_at")
    val publishedAt:String? = null,

    val content : String?= null

)