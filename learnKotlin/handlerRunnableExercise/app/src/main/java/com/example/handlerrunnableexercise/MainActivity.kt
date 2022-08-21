package com.example.handlerrunnableexercise

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.text.method.ScrollingMovementMethod
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var handler = Handler(Looper.myLooper()!!)
    var runnable: Runnable = Runnable() { }
    var timeChro: Long = 0
    var timeSec: Long = 0
    var timeMinute: Long = 0
    var lapTimer : Int = 0
    var ss_Func: Boolean = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.start_stop_button).setOnClickListener { startChronometer() }
        findViewById<Button>(R.id.resetButton).setOnClickListener { resetChronometer() }
        findViewById<Button>(R.id.lapButton).setOnClickListener { lapChronometer() }
        findViewById<TextView>(R.id.LapText).movementMethod = ScrollingMovementMethod()
        findViewById<Button>(R.id.resetLap).setOnClickListener { findViewById<TextView>(R.id.LapText).text= ""
        lapTimer = 0}
    }

    fun startChronometer() {
        if (ss_Func) {
            runnable = object : Runnable {
                override fun run() {
                    timeChro += 1
                    if ((timeChro % 50).toInt() == 0) {
                        timeSec += 1
                        timeChro = 0
                    }
                    if (timeSec.toInt() != 0 && (timeSec % 60).toInt() == 0) {
                        timeMinute += 1
                        timeSec = 0
                    }
                    handler.postDelayed(runnable, 10)
                    findViewById<TextView>(R.id.remainingText).text =
                        "$timeMinute : ${timeSec} : ${(timeChro)}0"
                }
            }
            handler.post(runnable)
            ss_Func = false
            findViewById<Button>(R.id.start_stop_button).text = "Stop"
            findViewById<Button>(R.id.start_stop_button).setBackgroundColor(Color.RED)
        } else {
            handler.removeCallbacks(runnable)
            ss_Func = true
            findViewById<Button>(R.id.start_stop_button).text = "Start"
            findViewById<Button>(R.id.start_stop_button).setBackgroundColor(Color.parseColor("#46C68A"))
        }
    }

    fun lapChronometer() {
        lapTimer +=1
        val lapText = findViewById<TextView>(R.id.LapText)
        lapText.text = "$lapTimer -> Minute: ${timeMinute} Second: $timeSec MiliSecond ${timeChro}0\n" + lapText.text
    }

    fun resetChronometer() {
        timeChro = 0
        timeSec = 0
        timeMinute = 0
        findViewById<TextView>(R.id.remainingText).text = "00 : 00 : 00"
    }
}