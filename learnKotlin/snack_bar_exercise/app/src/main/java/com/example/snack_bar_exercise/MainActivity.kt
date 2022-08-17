package com.example.snack_bar_exercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastclick(view: View){
        Toast.makeText(this@MainActivity,"this a toast bar message",Toast.LENGTH_LONG).show()
    }
    fun SnackBarClick(view: View){
        Snackbar.make(window.decorView.rootView,"this a snackbar message",1500).show()
    }

}