package com.example.neumorphism_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import com.airbnb.lottie.LottieAnimationView
import com.example.neumorphism_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    var isCheckedDone = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvSignup!!.setOnClickListener{  Toast.makeText(applicationContext,"Available soon",Toast.LENGTH_SHORT).show() }

        binding.mnLogo.speed = 3f;

        binding.mnLogo.setOnClickListener{

            isCheckedDone = if(isCheckedDone){


                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                Toast.makeText(applicationContext,"Shifted to Dark Mode",Toast.LENGTH_SHORT).show()
                binding.tvApp!!.text = "Bright"
                binding.mnLogo.setAnimation(R.raw.dark)
                binding.mnLogo.setMinAndMaxProgress(0.5f,1.0f)
                binding.mnLogo.playAnimation()
                false

            }else{

                Toast.makeText(applicationContext,"Shifted to Bright Mode",Toast.LENGTH_SHORT).show()
                binding.tvApp!!.text = "Dark"
                binding.mnLogo.setAnimation(R.raw.ddark)
                binding.mnLogo.setMinAndMaxProgress(0.0f,0.5f)
                binding.mnLogo.playAnimation()
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                true

            }

        }






    }
}