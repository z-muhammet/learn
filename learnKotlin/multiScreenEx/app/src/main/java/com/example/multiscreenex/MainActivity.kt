package com.example.multiscreenex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    findViewById<Button>(R.id.goactivityTwo).setOnClickListener {
        startActivityForResult(Intent(this@MainActivity,activity2::class.java),0)
    }
    }


}