package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityFifthbirdBinding
import com.squareup.picasso.Picasso

class fifthbird: AppCompatActivity() {
    lateinit var binding: ActivityFifthbirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityFifthbirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPrev5.setOnClickListener{
            val intent=Intent(this,fourth_activity::class.java)
            startActivity(intent)
        }
  Picasso.get()
      .load("https://images.unsplash.com/photo-1555677284-6a6f971638e0?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NHx8b3dsfGVufDB8fDB8fHww")
      .into(binding.imageView6)

    }
}