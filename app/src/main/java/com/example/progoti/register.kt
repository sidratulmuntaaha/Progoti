package com.example.progoti

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)
        val log_in: Button = findViewById(R.id.signup_button)

        // Set a click listener
        log_in.setOnClickListener {
            // Navigate to the next layout (Activity)
            val intent = Intent(this,homepage::class.java)
            startActivity(intent)
        }
    }
}