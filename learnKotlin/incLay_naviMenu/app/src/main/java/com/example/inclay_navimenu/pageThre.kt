package com.example.inclay_navimenu

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pageThre : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_theree)

        val buttonThree = findViewById<Button>(R.id.page_Three)
        buttonThree.setTextColor(Color.parseColor("#ffffff"))
    }
}