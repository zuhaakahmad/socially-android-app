package com.example.ZuhaakAhmad.i221352

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class KyanProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kyan_profile)

        val backBtn = findViewById<ImageView>(R.id.backBtn)
        val menuBtn = findViewById<ImageView>(R.id.menuBtn)
        val followingBtn = findViewById<Button>(R.id.followingBtn)
        val messageBtn = findViewById<Button>(R.id.messageBtn)
        val emailBtn = findViewById<Button>(R.id.emailBtn)
        val suggestBtn = findViewById<Button>(R.id.suggestBtn)
        val gridToggleBtn = findViewById<ImageView>(R.id.gridToggleBtn)
        val taggedToggleBtn = findViewById<ImageView>(R.id.taggedToggleBtn)



        backBtn.setOnClickListener {
            finish()
        }

        messageBtn.setOnClickListener {
            startActivity(Intent(this, ChatActivity::class.java))
        }


    }
}