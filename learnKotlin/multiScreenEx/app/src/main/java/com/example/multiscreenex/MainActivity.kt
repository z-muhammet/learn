package com.example.multiscreenex


import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var hebele = findViewById<TextView>(R.id.mainData)
        fun alertDia(Title: String, Message: String) {
            val alert = AlertDialog.Builder(this)
            alert.setTitle(Title).setMessage(Message)
            alert.setPositiveButton("ok", DialogInterface.OnClickListener { dialogInterface, i ->
                hebele.text = "asdasd"
            })
            alert.create().show()
        }

        val heb = Intent(applicationContext, activity2::class.java)
        val intent = intent
        val dataFrom = intent.getStringExtra("dataActTwo")

        if (dataFrom == "") alertDia("Data", "u haven't a Data") else hebele.text = dataFrom


        findViewById<Button>(R.id.goactivityTwo).setOnClickListener {
            val editTextData = findViewById<EditText>(R.id.transferData).text.toString()
            heb.putExtra("mainActData", editTextData)
            startActivity(heb)
            finish()
        }
    }

}