package com.example.inclay_navimenu

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class pageTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_two)
        val buttonTwo = findViewById<Button>(R.id.page_Two)
            buttonTwo.setTextColor(Color.parseColor("#ffffff"))
    }
    fun navitePage(view: View){
        val pTwo = Intent(this,pageTwo::class.java)
        val pThree = Intent(this,pageThre::class.java)
        val pFour = Intent(this,pageFour::class.java)
        val pOne = Intent(this,MainActivity::class.java)

        when (view.tag){
            "1" -> { startActivity(pOne)
                finish()}
            "2" -> {startActivity(pTwo)
                finish()}
            "3" ->{ startActivity(pThree)
                finish()}
            "4" -> {startActivity(pFour)
                finish()}
        }
    }
}