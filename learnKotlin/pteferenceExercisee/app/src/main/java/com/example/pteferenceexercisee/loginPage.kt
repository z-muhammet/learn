package com.example.pteferenceexercisee

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class loginPage : AppCompatActivity() {
    lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)
        sharedPreferences = this.getSharedPreferences("com.example.preferencesexercise", Context.MODE_PRIVATE)
        findViewById<Button>(R.id.loginButton).setOnClickListener { login() }
    }
    fun login(){
        val uName = findViewById<EditText>(R.id.userNameEditText)
        val uPass = findViewById<EditText>(R.id.passwordEdiText)
        sharedPreferences.edit().putString("userName",uName.text.toString()).apply()
        sharedPreferences.edit().putString("passWord",uPass.text.toString()).apply()
        finish()
    }
}