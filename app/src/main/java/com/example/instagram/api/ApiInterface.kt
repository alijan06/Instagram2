package com.example.instagram.api

import com.example.instagram.models.Photo
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query


interface ApiInterface {

    @Headers("Authorization: Client-ID ${Constants.API_KEY}")
    @GET("photos")
    suspend fun getPhotos(
        @Query("page") page : Int,
        @Query("next_page") per_page : Int
    ) : List<Photo>
}