package com.example.instagram.models

import com.google.gson.annotations.SerializedName

data class Links(
    @SerializedName("self") val self : String,
    @SerializedName("followers") val followers: String,
    @SerializedName("following") val following: String,
    @SerializedName("html") val html: String,
    @SerializedName("likes") val likes: String,
    @SerializedName("photos") val photos: String,
)
