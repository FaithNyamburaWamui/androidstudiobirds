package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityFourthBinding
import com.squareup.picasso.Picasso

class fourth_activity : AppCompatActivity() {
    lateinit var binding: ActivityFourthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityFourthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPrev3.setOnClickListener{
            val intent=Intent(this,third_activity::class.java)
            startActivity(intent)
        }
        binding.btnNext4.setOnClickListener{
            val intent=Intent(this,fifthbird::class.java)
            startActivity(intent)
        }

        Picasso.get().load("https://images.unsplash.com/photo-1609127554433-3a850e16bbdd?q=80&w=1935&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D").into(binding.imageView4)
        }
    }
