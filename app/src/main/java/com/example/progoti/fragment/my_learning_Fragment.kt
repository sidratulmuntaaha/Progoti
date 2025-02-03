package com.example.progoti.fragment

import com.example.progoti.adapter.MyLearningItem
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.progoti.R
import com.example.progoti.databinding.FragmentMyLearningBinding

class my_learning_Fragment : Fragment() {

    private lateinit var binding: FragmentMyLearningBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentMyLearningBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Sample data for courses
        val courseItems = listOf(
            MyLearningItem("Programming", R.drawable.banner1),
            MyLearningItem("Banking",  R.drawable.banner2),
            MyLearningItem("Research",  R.drawable.banner4),
            MyLearningItem("Math",  R.drawable.banner_5)
        )

        // Add CardViews to the LinearLayout
        for (item in courseItems) {
            addCardView(item)
        }
    }

    private fun addCardView(item: MyLearningItem) {
        // Inflate the CardView layout
        val cardView = layoutInflater.inflate(R.layout.fragment_my_learning_, null)

        // Find views in the CardView layout
//        val imageView: ImageView = cardView.findViewById(R.id.image1) // Update ID based on your layout
//        val titleTextView: TextView = cardView.findViewById(R.id.title1) // Update ID based on your layout
//         // Update ID based on your layout
//
//        // Set data to the views
//        imageView.setImageResource(item.imageResourceId)
//        titleTextView.text = item.title


        // Add the CardView to the LinearLayout
        binding.cardContainer.addView(cardView) // Use the ID of the LinearLayout
    }
}

//package com.example.progoti.fragment
//
//import android.os.Bundle
//import androidx.fragment.app.Fragment
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.Toast
//import androidx.recyclerview.widget.LinearLayoutManager
//import com.denzcoskun.imageslider.constants.ScaleTypes
//import com.denzcoskun.imageslider.interfaces.ItemClickListener
//import com.denzcoskun.imageslider.models.SlideModel
//import com.example.progoti.R
//import com.example.progoti.adapter.popularAdapter
//import com.example.progoti.databinding.FragmentHomeBinding
//import com.example.progoti.databinding.FragmentMyLearningBinding
//
//
//
//class my_learning_Fragment : Fragment() {
//
//    private lateinit var binding: FragmentMyLearningBinding
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
////        arguments?.let {
////            param1 = it.getString(ARG_PARAM1)
////            param2 = it.getString(ARG_PARAM2)
////        }
//    }
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        binding = FragmentMyLearningBinding.inflate(inflater,container,false)
//        return binding.root
//
//
//
//
//    }
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        val course_name = listOf("Programming" , "Banking", "Research", "Math" )
//        val price = listOf("50$","60$","40$","80$")
//        val course_images = listOf(R.drawable.banner1,R.drawable.banner2,R.drawable.banner4,R.drawable.banner_5)
//        val adapter = popularAdapter(course_name,price,course_images)
//        binding.MylearningRecylcer.layoutManager = LinearLayoutManager(requireContext())
//        binding.popularRecylcer.adapter = adapter
//
//    }
//
//
//
//    companion object {
//
//    }
//}