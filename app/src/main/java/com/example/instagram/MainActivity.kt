package com.example.instagram

import android.os.Bundle
import android.util.Log
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.instagram.databinding.ActivityMainBinding
import com.example.instagram.api.RetrofitInstance
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rcView.layoutManager = LinearLayoutManager(this)

        CoroutineScope(Dispatchers.Main).launch {
            val images = try {
                RetrofitInstance.apiInterface.getPhotos(2, 15)
            } catch (e: Exception) {
                Log.e("Image", "Exception: $e")
                return@launch
            }
            val adapter = InstagramAdapter(images)
            binding.rcView.adapter = adapter

            onCheckChangeListener()
        }
    }

        private fun onCheckChangeListener() {
            findViewById<CheckBox>(R.id.like)

//            Toast.makeText(this, "Like",  Toast.LENGTH_LONG).show();

        }
    }




