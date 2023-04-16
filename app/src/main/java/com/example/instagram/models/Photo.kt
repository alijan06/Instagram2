package com.example.instagram.models

import com.google.gson.annotations.SerializedName

 data class Photo(
     @SerializedName("id") val id : String,
     @SerializedName("width") val width : String,
     @SerializedName("height") val height : String,
     @SerializedName("color") val color : String,
     @SerializedName("description") val description : String,
     @SerializedName("urls") val urls : UnsplashUrls,
     @SerializedName("user") val user : User,
     @SerializedName("likes") val likes : String,
     @SerializedName("title") val title : String,
 )
