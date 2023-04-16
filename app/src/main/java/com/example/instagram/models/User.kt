package com.example.instagram.models

import com.google.gson.annotations.SerializedName

 data class User(
     @SerializedName("id") val id: String,
     @SerializedName("username") val user_name : String,
     @SerializedName("name") val name: String,
     @SerializedName("location") val location : String,
     @SerializedName("profile_image") val profileImage: ProfileImage,
     @SerializedName("links") val links: Links,
 )