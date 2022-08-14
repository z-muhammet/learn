package com.example.inclay_navimenu

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pageTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_two)
        val buttonTwo = findViewById<Button>(R.id.page_Two)
            buttonTwo.setTextColor(Color.parseColor("#ffffff"))
    }
}