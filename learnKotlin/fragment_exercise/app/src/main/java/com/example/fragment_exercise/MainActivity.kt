package com.example.fragment_exercise

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout,first_fragment()).commit()
        findViewById<Button>(R.id.previous).isEnabled = false
        findViewById<Button>(R.id.next).setOnClickListener {
            nextFragment()
        }
        findViewById<Button>(R.id.previous).setOnClickListener {
            previous()
        }
    }
    fun previous(){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, first_fragment()).commit()
        val prevButton = findViewById<Button>(R.id.previous)
        prevButton.isEnabled = false
        prevButton.setBackgroundColor(Color.parseColor("#888888"))
        findViewById<Button>(R.id.next).isEnabled = true
        findViewById<Button>(R.id.next).setBackgroundColor(Color.parseColor("#9CB6B1"))
    }
    fun nextFragment(){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, second_fragment()).commit()
        val nextButton = findViewById<Button>(R.id.next)
        nextButton.isEnabled = false
        nextButton.setBackgroundColor(Color.parseColor("#888888"))
        findViewById<Button>(R.id.previous).isEnabled = true
        findViewById<Button>(R.id.previous).setBackgroundColor(Color.parseColor("#9CB6B1"))
    }

}