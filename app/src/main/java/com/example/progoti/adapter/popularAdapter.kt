package com.example.progoti.adapter

import android.media.Image
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.progoti.databinding.PopularcoursesBinding

class popularAdapter(private val items : List<String>,private val prices:List<String>,private val image:List<Int>) : RecyclerView.Adapter<popularAdapter.popularViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): popularViewHolder {
        return popularViewHolder(PopularcoursesBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }
    override fun onBindViewHolder(holder: popularViewHolder, position: Int) {
        val item = items[position]
        val images = image[position]
        val price = prices[position]
        holder.bind(item,price,images)
    }
    override fun getItemCount(): Int {
        return items.size
    }
    class popularViewHolder (private val binding: PopularcoursesBinding ) : RecyclerView.ViewHolder(binding.root){
        val imagesView = binding.imageView
        fun bind(item: String,prices: String, images: Int) {
            binding.courses.text=item
            binding.popularprices.text=prices
            imagesView.setImageResource(images)
        }

    }
}