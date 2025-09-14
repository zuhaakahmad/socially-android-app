package com.example.ZuhaakAhmad.i221352

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class EditProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        val cancelBtn = findViewById<TextView>(R.id.cancelBtn)
        val doneBtn = findViewById<TextView>(R.id.doneBtn)
        val changePhotoBtn = findViewById<TextView>(R.id.changePhotoBtn)
        val switchToProfessionalBtn = findViewById<TextView>(R.id.switchToProfessionalBtn)

        cancelBtn.setOnClickListener {
            finish()
        }

        doneBtn.setOnClickListener {
            finish()
        }

        changePhotoBtn.setOnClickListener {
            // Handle photo change
        }

        switchToProfessionalBtn.setOnClickListener {
            // Handle account type switch
        }
    }
}
