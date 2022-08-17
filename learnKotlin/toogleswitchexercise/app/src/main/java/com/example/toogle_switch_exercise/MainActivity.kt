package com.example.toogle_switch_exercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CompoundButton
import android.widget.Switch
import android.widget.TextView
import android.widget.ToggleButton
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Switch>(R.id.switchBtn).setOnCheckedChangeListener(checkToogle)
        findViewById<ToggleButton>(R.id.toggleBtn).setOnCheckedChangeListener(checkToogle)
    }

    fun holybind(text: String,btnType: CompoundButton) {
        var heb = "";
        val hebele = findViewById<TextView>(R.id.checkText)
        if (btnType.equals(findViewById(R.id.toggleBtn))){
           heb = "$text toggle button"
        }else if(btnType.equals(findViewById(R.id.switchBtn))){
            heb = "$text switch button"
        }
        hebele.setText(heb).toString()
    }

    var checkToogle =
        CompoundButton.OnCheckedChangeListener { btn: CompoundButton, status: Boolean ->
            if (status == true) {
                holybind("on" ,btn)
            } else {
                holybind("off",btn)
            }
        }

}