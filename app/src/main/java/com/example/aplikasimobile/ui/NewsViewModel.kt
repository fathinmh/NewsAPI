package com.example.aplikasimobile.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.aplikasimobile.model.Article
import com.example.aplikasimobile.network.Api
import kotlinx.coroutines.launch

class NewsViewModel : ViewModel(){
    init {
        getListNews()
    }
    fun getListNews(){
        viewModelScope.launch {
            val response = Api.newsApiService.getTopHeadline()
            val articles = response.articles

            articles.forEach { article: Article ->
                Log.d("response", articles.toString())
            }
        }
    }
}