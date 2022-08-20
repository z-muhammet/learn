package com.example.timerexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    public var time: Long = 0
    public var hebele: Long = 0
    public var startStop : Boolean = false
    fun timerControl(func: Int) {

        var timeDown = object : CountDownTimer(time, 1000) {
            override fun onTick(p0: Long) {
                val reamText = findViewById<TextView>(R.id.remainingTime)
                reamText.text = (p0 / 1000).toString()
                hebele = p0
                if (startStop==false) cancel()
            }

            override fun onFinish() {
                println()
            }
        }
        if (func==1) timeDown.start()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.startTimer).setOnClickListener {
            val timeEdittext = findViewById<EditText>(R.id.timerEditText)
            time = timeEdittext.text.toString().toLong()
            startStop = true
            timerControl(1)
        }
        findViewById<Button>(R.id.pauseTimer).setOnClickListener {
            startStop = false

        }
        findViewById<Button>(R.id.resumeTimer).setOnClickListener {
            time = hebele
            startStop = true
            timerControl(1)
        }
    }
}
