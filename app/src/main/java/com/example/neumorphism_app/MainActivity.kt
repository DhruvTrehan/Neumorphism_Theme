package com.example.neumorphism_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.neumorphism_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvSignup!!.setOnClickListener {
            Toast.makeText(
                applicationContext,
                "Available soon",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}