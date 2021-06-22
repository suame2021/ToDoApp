package com.suame.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val validusername: String = "admin"
    val validpassword: String = "admin"

    //layout variables
    private lateinit var usernameInput: EditText
    private lateinit var passwordInput: EditText
    private lateinit var submitButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        usernameInput = findViewById(R.id.usernameinput)
        passwordInput = findViewById(R.id.passwordinput)
        submitButton = findViewById(R.id.submitbotton)

        submitButton.setOnClickListener {
            val username=usernameInput.text.toString()
            val password=passwordInput.text.toString()
            login(username,password)
        }

    }

    fun login(username: String, password: String) {

        if (isvalidCredentials(username, password)) {
            val intent:Intent=Intent(this, Homeactivity::class.java)
            intent.putExtra("username", username)
            startActivity(intent)

        }else{
            Toast.makeText(applicationContext,"Invalid Credentials",Toast.LENGTH_SHORT).show()
        }


    }

    private fun isvalidCredentials(username: String, password: String): Boolean {
        if (username == validusername &&password == validpassword) return true
        return false

    }
}
