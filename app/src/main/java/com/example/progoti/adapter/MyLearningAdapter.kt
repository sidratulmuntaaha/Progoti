package com.example.progoti.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.progoti.R

class MyLearningAdapter(
    private val context: Context,
    private val items: List<MyLearningItem>
) : BaseAdapter() {

    override fun getCount(): Int {
        return items.size
    }

    override fun getItem(position: Int): Any {
        return items[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = convertView ?: LayoutInflater.from(context).inflate(R.layout.fragment_my_learning_, parent, false)

        val image: ImageView = view.findViewById(R.id.image1) // Update ID based on your layout
        val title: TextView = view.findViewById(R.id.title1) // Update ID based on your layout


        val item = items[position]
        title.text = item.title
        image.setImageResource(item.imageResourceId)

        return view
    }
}
