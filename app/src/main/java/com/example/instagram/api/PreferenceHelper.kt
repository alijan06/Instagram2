package com.example.instagram.api

import android.content.Context
import android.widget.ImageView
import coil.ImageLoader
import coil.load

object PreferenceHelper {

    lateinit var imageLoader: ImageLoader

    fun initializeImageLoader(context: Context) {
        imageLoader = ImageLoader.Builder(context)
            .crossfade(true)
            .build()
    }

    fun loadImage(url: String, target: ImageView) {
        target.load(url, imageLoader)
    }
}