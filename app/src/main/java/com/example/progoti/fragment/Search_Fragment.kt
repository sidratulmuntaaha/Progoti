package com.example.progoti.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.databinding.adapters.SearchViewBindingAdapter
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.progoti.R
import com.example.progoti.adapter.SearchAdapter

class Search_Fragment : Fragment() {

    private lateinit var searchView: SearchView
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: SearchAdapter
    private var itemList = listOf("Programming", "Banking", "Research", "Math", "Programming", "Banking", "Research", "Math")
    private var filteredList = itemList.toMutableList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_search_, container, false)

        searchView = view.findViewById(R.id.search_view)
        recyclerView = view.findViewById(R.id.recycler_view)

        // Set up RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(context)
        adapter = SearchAdapter(filteredList)
        recyclerView.adapter = adapter

        // Set up SearchView listener
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                filter(newText)
                return true
            }
        })

        return view
    }

    private fun filter(query: String?) {
        filteredList.clear()
        if (query.isNullOrEmpty()) {
            filteredList.addAll(itemList)
        } else {
            val filterPattern = query.toLowerCase().trim()
            for (item in itemList) {
                if (item.toLowerCase().contains(filterPattern)) {
                    filteredList.add(item)
                }
            }
        }
        adapter.notifyDataSetChanged()

    }
}