package com.example.redcarpetsampleproject.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import com.example.redcarpetsampleproject.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_article.*

class ArticleActivity : AppCompatActivity() {

    val bundle:Bundle? = intent.extras
     var content: String?= null
     var banner :String? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article)

        if(bundle!=null){
            content = bundle.getString("Content")
            banner = bundle.getString("Banner")
        }

        Picasso.get().load(banner).into(articleBanner)
        articleContent.text = content



    }
}