package com.example.instagram

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.instagram.databinding.ItemBinding
import com.example.instagram.models.Photo
import com.example.instagram.api.PreferenceHelper

class InstagramAdapter(private val unsplashImage : List<Photo>
) : RecyclerView.Adapter<InstagramViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InstagramViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemBinding.inflate(layoutInflater, parent, false)
        return InstagramViewHolder(binding)
    }

    override fun onBindViewHolder(holder: InstagramViewHolder, position: Int) {
        val unsplashImage = unsplashImage[position]

        holder.binding.apply {
//            Image
            textTv.text = unsplashImage.description
            PreferenceHelper.loadImage(unsplashImage.urls.regular, photo)

//            User
            userName.text = unsplashImage.user.name
            PreferenceHelper.loadImage(unsplashImage.user.profileImage.medium, userImage)

        }
    }

    override fun getItemCount() = unsplashImage.size

    }


class InstagramViewHolder(val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root)