package com.example.cvmobileapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Background2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_background2)

        var text = findViewById<TextView>(R.id.flecha)
        text.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}