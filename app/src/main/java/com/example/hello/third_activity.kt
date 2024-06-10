package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityThirdBinding
import com.squareup.picasso.Picasso

class third_activity : AppCompatActivity() {
    lateinit var binding: ActivityThirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnPrev2.setOnClickListener{
            val intent=Intent(this,second_activity::class.java)
            startActivity(intent)
        }
        binding.btnNext3.setOnClickListener{
            val intent=Intent(this,fourth_activity::class.java)
            startActivity(intent)
        }

        Picasso.get().load("https://images.unsplash.com/photo-1512819432727-dbcb57a06f13?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTJ8fHBhcnJvdHxlbnwwfHwwfHx8MA%3D%3D")
            .into(binding.imageView3)

    }
}