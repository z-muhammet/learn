package com.example.greek_mythology_book

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var godsName = ArrayList<String>()
        godsName.add("chaos")
        godsName.add("gaia")
        godsName.add("tartarus")
        godsName.add("eros")

        var godsPic = ArrayList<Bitmap>()
        val chaosBitmap =
            BitmapFactory.decodeResource(applicationContext.resources, R.drawable.chaos)
        val gaiaBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.gaia)
        val tartarusBitmap =
            BitmapFactory.decodeResource(applicationContext.resources, R.drawable.tartarus)
        val erosBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.eros)
        godsPic.add(chaosBitmap)
        godsPic.add(gaiaBitmap)
        godsPic.add(tartarusBitmap)
        godsPic.add(erosBitmap)


        val layoutManager = LinearLayoutManager(this)
        findViewById<RecyclerView>(R.id.recyclerView).layoutManager = layoutManager

        val recyclerAdapter = recyclerAdapter(godsName,godsPic,this)

        findViewById<RecyclerView>(R.id.recyclerView).adapter = recyclerAdapter

    }
}


