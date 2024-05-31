package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class third_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)
        val btnPrev2=findViewById<ImageView>(R.id.btnPrev2)
        val btnNext3=findViewById<ImageView>(R.id.btnNext3)

        btnPrev2.setOnClickListener{finish()}
        btnNext3.setOnClickListener{
            val intent=Intent(this,fourth_activity::class.java)
            startActivity(intent)
        }

    }
}