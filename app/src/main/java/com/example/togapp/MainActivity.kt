package com.example.togapp

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Toast
import com.example.togapp.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    var animationStatus :Boolean = false
    val ANIMATION_DURATION :Long = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_TOGAPP)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonLogin.setOnClickListener(){
            if(animationStatus == true){
                val intent= Intent(this,MainMenuActivity::class.java)
                startActivity(intent)
            }
            else {
                animationHandler()
                animationObjectHandler()
                animationStatus = true
            }

            }
        binding.btnDaftar.setOnClickListener(){
            notReady()
         }
        }

    fun notReady(){
        Toast.makeText(this, "Fitur belum tersedia", Toast.LENGTH_SHORT).show()
        }

    fun animationHandler(){
        val animatorImage :ObjectAnimator = ObjectAnimator.ofFloat(binding.imagelogin,"y",-400f)
        val animatorLogo :ObjectAnimator = ObjectAnimator.ofFloat(binding.imageStand,"y",800f)
        animatorImage.setDuration(ANIMATION_DURATION)
        animatorLogo.setDuration(ANIMATION_DURATION)
        val aniSet = AnimatorSet()
        aniSet.run {
            playTogether(animatorLogo,animatorImage)
            start()
            }
        }
    fun animationObjectHandler(){
        binding.textPlastik.setText(R.string.kamu_selangkah_lagi_buat_bumi_kita_lebih_baik)
        binding.textPlastik.setTextSize(40F)
        binding.btnDaftar.setText("Lupa sandi?")
        binding.textBumi.visibility = View.INVISIBLE
        binding.email.visibility = View.VISIBLE
        binding.password.visibility = View.VISIBLE
        }
    }