package com.example.progoti

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.log

class signin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_in)
        val log_in: Button = findViewById(R.id.login_button)

        // Set a click listener
        log_in.setOnClickListener {
            // Navigate to the next layout (Activity)
            val intent = Intent(this,homepage::class.java)
            startActivity(intent)
        }
        val sign_up: TextView = findViewById(R.id.vctosignup)

        // Set a click listener
        sign_up.setOnClickListener {
            // Navigate to the next layout (Activity)
            val intent = Intent(this,register::class.java)
            startActivity(intent)
        }


    }
}