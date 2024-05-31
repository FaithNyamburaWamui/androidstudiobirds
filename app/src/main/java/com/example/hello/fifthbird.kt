package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class fifthbird: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fifthbird)
        val btnPrev5=findViewById<ImageView>(R.id.btnPrev5)

        btnPrev5.setOnClickListener{
            val intent=Intent(this,fourth_activity::class.java)
            startActivity(intent)
        }


    }
}