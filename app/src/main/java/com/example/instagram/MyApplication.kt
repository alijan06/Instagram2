package com.example.instagram

import android.app.Application
import com.example.instagram.api.PreferenceHelper.initializeImageLoader

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        initializeImageLoader(this)
    }
}