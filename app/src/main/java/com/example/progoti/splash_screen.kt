package com.example.progoti

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class splash_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        // Add a delay to mimic a splash screen
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this@splash_screen, signin::class.java)
            startActivity(intent)
            finish() // Ensures the splash screen is removed from the back stack
        }, 2000) // Delay in milliseconds
    }
}


//class splash_screen :  AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_splash_screen)
//        android.os.Handler().postDelayed({
//            startActivity(Intent(this@splash_screen, signin::class.java))
//            finish();
//        }, 2500)
//
//    }
//}