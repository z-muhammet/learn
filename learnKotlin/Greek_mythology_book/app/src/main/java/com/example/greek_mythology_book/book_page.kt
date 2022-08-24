package com.example.greek_mythology_book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class book_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_page)
       val intent = intent
        val godname = intent.getStringExtra("godName")
        findViewById<TextView>(R.id.textView).text = godname
        findViewById<ImageView>(R.id.imageView).setImageBitmap(singletonclass.selectGodImage.selectedImage)
    }
}