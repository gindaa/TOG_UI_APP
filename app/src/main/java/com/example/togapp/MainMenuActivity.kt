package com.example.togapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.togapp.databinding.ActivityMainBinding
import com.example.togapp.databinding.ActivityMainMenuBinding

class MainMenuActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainMenuBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonBurger.setOnClickListener(){
            val intent = Intent(this,PengaturanActivity::class.java)
            startActivity(intent)
        }
    }
}