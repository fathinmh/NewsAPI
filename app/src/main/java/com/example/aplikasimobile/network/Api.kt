package com.example.aplikasimobile.network

object Api {
    val newsApiService: NewsApiService by lazy {
        retrofit.create(NewsApiService::class.java)
    }
}