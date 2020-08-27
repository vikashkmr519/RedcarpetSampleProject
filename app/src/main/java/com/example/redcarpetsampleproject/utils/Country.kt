package com.example.redcarpetsampleproject.utils

import java.util.*

class Country {

    fun getCountry(): String? {
        val locale: Locale = Locale.getDefault()
        val country: String = java.lang.String.valueOf(locale.getCountry())
        return country.toLowerCase()
    }
}