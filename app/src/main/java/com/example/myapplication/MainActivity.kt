package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickMe = findViewById<Button>(R.id.click_me)
        clickMe.setOnClickListener{
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }
}
