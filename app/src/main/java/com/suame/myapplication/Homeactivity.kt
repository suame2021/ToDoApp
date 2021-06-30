package com.suame.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.suame.myapplication.databinding.ActivityHomeactivityBinding
import com.suame.myapplication.databinding.ActivityProfileBinding
import kotlinx.android.synthetic.main.activity_homeactivity.*

class Homeactivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.profilebutton.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }

}