package com.example.togapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.core.os.HandlerCompat.postDelayed

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        goMain()
    }

    fun goMain(){
        Handler().postDelayed({
            val i = Intent(this,MainActivity::class.java)
            finish()
            startActivity(i)
        },2000)

    }
}