package com.example.plane

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.plane.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    var speed = 40F
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivUp.setOnClickListener {
            move(0F, -speed, 0F)

        }

        binding.ivDown.setOnClickListener {
            move(0F, speed, 180F)
        }

        binding.ivRight.setOnClickListener {
            move(speed, 0F, 90F)
        }

        binding.ivLeft.setOnClickListener {
            move(-speed, 0F, 270F)
        }
    }

    private fun move(x: Float, y: Float, rotation: Float) {
        binding.ivPlane.x += x
        binding.ivPlane.y += y
        binding.ivPlane.rotation = rotation
    }

}