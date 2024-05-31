package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class fourth_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fourth)

        val btnPrev3=findViewById<ImageView>(R.id.btnPrev3)
        val btnNext4=findViewById<ImageView>(R.id.btnNext4)

        btnPrev3.setOnClickListener{
            val intent=Intent(this,third_activity::class.java)
            startActivity(intent)
        }
        btnNext4.setOnClickListener{
            val intent=Intent(this,fifthbird::class.java)
            startActivity(intent)
        }
        }
    }
