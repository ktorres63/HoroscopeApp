package com.tutorial.horoscopeapp.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tutorial.horoscopeapp.R
import com.tutorial.horoscopeapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}