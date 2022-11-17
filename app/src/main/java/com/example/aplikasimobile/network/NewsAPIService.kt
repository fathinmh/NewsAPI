package com.example.aplikasimobile.network

import com.example.aplikasimobile.model.NewsData
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

val BASE_URL = "https://run.mocky.io/v3/4a6b4002-e45f-4ffd-8b9e-508419c6ff0a"

val retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface NewsApiService { // Untuk define API yang dipakai
    @GET("top-headlines?country=id&apiKey=1c0bed622df14993bab444ba3742f369")
    suspend fun getTopHeadline(): NewsData
}