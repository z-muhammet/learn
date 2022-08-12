package com.example.myfirstproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun screen(view: View) {
        finish()
        val  intent = Intent(this,MainActivity3::class.java)
        val heb = null
        Log.w(heb, "screen: ", )
        startActivity(intent)
    }

}