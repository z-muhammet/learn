package com.example.multiscreenex

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2)
        var hebele = findViewById<TextView>(R.id.actTwoData)
        fun alertDia(Title: String, Message: String) {
            val alert = AlertDialog.Builder(this)
            alert.setTitle(Title)
            alert.setMessage(Message)
            alert.setPositiveButton("ok", DialogInterface.OnClickListener { dialogInterface, i ->
                   hebele.text = null
            })
            alert.create().show()
        }
        val intentData = Intent(applicationContext,MainActivity::class.java)
        val intent = intent
        val data = intent.getStringExtra("mainActData")
        if (data == "") alertDia("Data", "u haven't a Data") else  { hebele.text = data }
        findViewById<Button>(R.id.goBack).setOnClickListener {
            val dataBack =findViewById<EditText>(R.id.backData).text.toString()
            intentData.putExtra("dataActTwo",dataBack)
            startActivity(intentData)
            finish()
        }
    }
}