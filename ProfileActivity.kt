package com.example.ZuhaakAhmad.i221352

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val editProfileBtn = findViewById<Button>(R.id.editProfileBtn)
        val menuBtn = findViewById<ImageView>(R.id.menuBtn)
        val gridToggleBtn = findViewById<ImageView>(R.id.gridToggleBtn)
        val taggedToggleBtn = findViewById<ImageView>(R.id.taggedToggleBtn)



        editProfileBtn.setOnClickListener {
            startActivity(Intent(this, EditProfileActivity::class.java))
        }


    }
}
