package com.example.newsapp.data.api

import com.example.newsapp.data.entity.NewsReponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("v2/top-headlines")
    suspend fun getNewsHeadline(
        @Query("country") country: String,
        @Query("apiKey") apiKey: String = API_KEY
    ): Response<NewsReponse>

//    https://newsapi.org/v2/top-headlines?country=us&apiKey=YourAPIKEY

    companion object{
        const val API_KEY = "e97227d8022440d39e743f1b19624e74"
    }
}