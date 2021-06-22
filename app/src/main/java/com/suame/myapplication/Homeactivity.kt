package com.suame.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class Homeactivity : AppCompatActivity() {

    private lateinit var usernameDisplay: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homeactivity)

      usernameDisplay=findViewById(R.id.usernameDisplay)
        usernameDisplay.text="Hello Human Beings"
    }
}