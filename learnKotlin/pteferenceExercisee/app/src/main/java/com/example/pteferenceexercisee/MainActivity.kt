package com.example.pteferenceexercisee

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sharedPreferences =
            this.getSharedPreferences("com.example.preferencesexercise", Context.MODE_PRIVATE)
        findViewById<Button>(R.id.logOutButton).setOnClickListener { logOut() }

    }

    override fun onStart() {

        val uName = sharedPreferences.getString("userName", "")
        val uPass = sharedPreferences.getString("passWord", "")
        if ((uName == null || uName == "" ) || (uPass == null || uPass == "")) {
            Toast.makeText(applicationContext, "pls u enter passWord and userName", Toast.LENGTH_SHORT).show()
            goLogin()
        }else{
           val welcomeText = findViewById<TextView>(R.id.welcomeText)
            welcomeText.text = "${welcomeText.text} ${uName}"
        }
        super.onStart()
    }

    fun goLogin() {
        val intent = Intent(this@MainActivity, loginPage::class.java)
        startActivity(intent)
    }
    fun logOut(){
        sharedPreferences.edit().remove("userName").apply()
        sharedPreferences.edit().remove("passWord").apply()
        recreate()
    }
}