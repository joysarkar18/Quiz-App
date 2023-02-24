package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.Window
import android.widget.Toast
import com.example.quizapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        binding.EnterBtn.setOnClickListener {
            if(binding.enteredName.text.toString().isEmpty()){
                Toast.makeText(applicationContext , "Enter your name" , Toast.LENGTH_SHORT).show()
            }
            else{
                val intent = Intent(this , QuestionAns::class.java)
                startActivity(intent)
                finish()
            }
        }

    }
}