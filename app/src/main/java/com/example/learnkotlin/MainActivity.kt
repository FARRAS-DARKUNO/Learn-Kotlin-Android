package com.example.learnkotlin

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button = findViewById<Button>(R.id.accessibility_custom_action_0)
        button.setOnClickListener {
            // Membuat Intent untuk pindah ke halaman berikutnya (Activity2)
            val intent = Intent(this, Activity2::class.java)
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.buttontologin)
        button2.setOnClickListener {
            // Membuat Intent untuk pindah ke halaman berikutnya (Activity2)
            val intent = Intent(this, Activity3::class.java)
            startActivity(intent)
        }
    }
}