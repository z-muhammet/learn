package com.example.checkbox_radio_imageview_exercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val red_cb = findViewById<CheckBox>(R.id.showRed_cb)
        val green_cb = findViewById<CheckBox>(R.id.showGreen_cb)
        val videoC_rb = findViewById<RadioButton>(R.id.videoCamera_rb)
        val microP_rb = findViewById<RadioButton>(R.id.microphone_rb)
        val redImageView = findViewById<ImageView>(R.id.redView)
        val greenImageView = findViewById<ImageView>(R.id.greenView)
        fun imageColor(): Int {
            return if (red_cb.isChecked && green_cb.isChecked) 3
            else if (red_cb.isChecked) 2
            else if (green_cb.isChecked) 1
            else 0
        }
        fun imageType(): Int {
            return if (videoC_rb.isChecked) 1
            else if (microP_rb.isChecked) 2
            else 0
        }
        fun showNow() {
            var img_green = R.drawable.green_microphone
            var img_red = R.drawable.red_microphone
            when (imageType()) {
                2 -> {
                    img_green = R.drawable.green_microphone
                    img_red = R.drawable.red_microphone
                }
                1-> {
                    img_green = R.drawable.green_video_camera
                    img_red = R.drawable.red_video_camera
                }
                0 -> Toast.makeText(this@MainActivity, "u select image Type", Toast.LENGTH_SHORT).show()
            }
            when (imageColor()) {
                0 -> {
                    greenImageView.visibility = View.GONE
                    redImageView.visibility = View.GONE
                    Toast.makeText(this@MainActivity, "u select color", Toast.LENGTH_LONG)
                        .show()
                }
                1 -> {
                    redImageView.visibility = View.GONE
                    greenImageView.visibility = View.VISIBLE
                }
                2 -> {
                    redImageView.visibility = View.VISIBLE
                    greenImageView.visibility = View.GONE
                }
                3 -> {
                    redImageView.visibility = View.VISIBLE
                    greenImageView.visibility = View.VISIBLE
                    Log.w("", "activated red and green")
                }
            }
            greenImageView.setImageResource(img_green)
            redImageView.setImageResource(img_red)
        }

        findViewById<Button>(R.id.button).setOnClickListener(){
            showNow()

        }
    }
}