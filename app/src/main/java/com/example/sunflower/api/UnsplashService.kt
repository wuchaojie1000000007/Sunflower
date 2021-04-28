package com.example.sunflower.api

import android.os.Build
import retrofit2.http.GET
import retrofit2.http.Query

interface UnsplashService {

    @GET("search/photos")
    suspend fun searchPhotos(
            @Query("query") query: String,
            @Query("page") page:Int,
            @Query("per_page") perPage:Int,
            @Query("client_id") clientID:String =
            )
}