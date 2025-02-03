package com.example.progoti

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.progoti.R.id.fragmentContainerView4
import com.google.android.material.bottomnavigation.BottomNavigationView

class homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_homepage)
        var NavController : NavController =findNavController(fragmentContainerView4)
        var bottomnav=findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomnav.setupWithNavController(NavController)

    }
}