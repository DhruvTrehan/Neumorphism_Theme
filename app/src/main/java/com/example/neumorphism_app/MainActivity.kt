package com.example.neumorphism_app

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.VideoView
import androidx.constraintlayout.motion.widget.MotionLayout
import com.example.neumorphism_app.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val llmain: MotionLayout? = binding.main

        binding.tvSignup!!.setOnClickListener {
            Toast.makeText(
                applicationContext,
                "Available soon",
                Toast.LENGTH_SHORT
            ).show()
        }


        binding.btnSignin!!.setOnClickListener {
            val cus_snackbar = Snackbar.make(
                llmain!!,
                "Signing You in soon",
                Snackbar.LENGTH_SHORT
            ).setAction("Retry"){ /* Action that u wamt to perform of intent some where */  }

            cus_snackbar.setActionTextColor(Color.parseColor("#193566"))
            cus_snackbar.setBackgroundTint(Color.parseColor("#eca5f3"))

            cus_snackbar.show()
        }
    }
}