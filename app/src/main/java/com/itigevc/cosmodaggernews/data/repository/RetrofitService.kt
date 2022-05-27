package com.itigevc.cosmodaggernews.data.repository

import com.itigevc.cosmodaggernews.data.model.NewsResponse
import retrofit2.http.GET

interface RetrofitService {

    @GET("top-headlines")
    suspend fun getAllTopHeadLines() : NewsResponse
}