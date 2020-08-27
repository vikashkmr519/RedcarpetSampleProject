package com.example.redcarpetsampleproject.data.models

import android.hardware.camera2.TotalCaptureResult
import com.google.gson.annotations.SerializedName
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AllNews (

    @Json(name = "status" )
    val status : String = "",

    @Json(name ="total_results")
    val totalResults: Double,


    @Json(name = "articles")
    val articles : List<Articles> = emptyList()
)
