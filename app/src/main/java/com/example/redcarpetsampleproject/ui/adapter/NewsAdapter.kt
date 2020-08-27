package com.example.redcarpetsampleproject.ui.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.redcarpetsampleproject.R
import com.example.redcarpetsampleproject.data.models.Articles
import com.example.redcarpetsampleproject.ui.view.ArticleActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_news.view.*


class NewsAdapter(val context:Context,val data : List<Articles>) :RecyclerView.Adapter<NewsAdapterViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)=  NewsAdapterViewHolder(LayoutInflater.from(parent.context).inflate(
        R.layout.item_news,parent,false))


    override fun onBindViewHolder(holder: NewsAdapterViewHolder, position: Int) {

        holder.newsHeading.text = data[position].title
        Picasso.get().load(data[position].urlToImage).into(holder.newsImg)

        holder.newsHeading.setOnClickListener{
            val intent = Intent(context,ArticleActivity::class.java)
            intent.putExtra("Banner",data[position].urlToImage)
            intent.putExtra("Content",data[position].content)
            context.startActivity(intent)
        }
    }



    override fun getItemCount() = data.size
}

class NewsAdapterViewHolder(itemView :View) : RecyclerView.ViewHolder(itemView) {

    val newsHeading = itemView.newsHeading
    val newsImg = itemView.newsImg


}


