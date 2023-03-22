package com.example.myoption

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init();
    }

    fun init()
    {

        var buy = findViewById<TextView>(R.id.text6)
        var meatting = findViewById<TextView>(R.id.text7)
        var move = findViewById<TextView>(R.id.text5)

        buy.setOnClickListener(){
            val intent = Intent(this, Page_two::class.java)
            startActivity(intent);
        }

        meatting.setOnClickListener(){
            val intent = Intent(this, third_page::class.java)
            startActivity(intent);
        }
        move.setOnClickListener(){
            val intent = Intent(this, page_four::class.java)
            startActivity(intent);
        }

    }
}