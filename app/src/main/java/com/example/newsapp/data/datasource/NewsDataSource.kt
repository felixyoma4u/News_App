package com.example.newsapp.data.datasource

import com.example.newsapp.data.api.ApiService
import com.example.newsapp.data.entity.NewsReponse
import retrofit2.Response
import retrofit2.http.Query

interface NewsDataSource {

    suspend fun getNewsHeadline(country: String): Response<NewsReponse>
}