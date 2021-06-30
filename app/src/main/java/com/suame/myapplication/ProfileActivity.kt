package com.suame.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.suame.myapplication.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding

    private lateinit var ProfileActivity:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
    binding= ActivityProfileBinding.inflate(layoutInflater)
    setContentView(binding.root)
        binding.homebutton.setOnClickListener {
            val intent=Intent(this, RecyclerView::class.java)
            startActivity(intent)
        }
    }
}