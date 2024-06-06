package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class second_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        val btnPrev = findViewById<ImageView>(R.id.btnPrev)
        val btnNext2 = findViewById<ImageView>(R.id.btnNext2)
        btnPrev.setOnClickListener {
            finish()
        }
        btnNext2.setOnClickListener {
            val intent = Intent(this, third_activity::class.java)
            startActivity(intent)
        }
    }
}
