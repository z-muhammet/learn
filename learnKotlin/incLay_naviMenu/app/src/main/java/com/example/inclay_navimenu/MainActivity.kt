package com.example.inclay_navimenu
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var actName = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        actName = this.localClassName
        val buttonOne = findViewById<Button>(R.id.page_One)
        if(actName == "MainActivity"){
            buttonOne.setTextColor(Color.parseColor("#ffffff"))
        }
    }
    public fun navitePage(view: View){
        val pTwo = Intent(this,pageTwo::class.java)
        val pThree = Intent(this,pageThre::class.java)
        val pFour = Intent(this,pageFour::class.java)
        val pOne = Intent(this,MainActivity::class.java)

        when (view.tag){
            "1" -> { startActivity(pOne)
                finish()}
            "2" -> {startActivity(pTwo)
                finish()}
            "3" ->{ startActivity(pThree)
                finish()}
            "4" -> {startActivity(pFour)
                finish()}
        }
    }

}