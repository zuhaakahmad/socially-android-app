package com.example.ZuhaakAhmad.i221352


import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GalleryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)

        val cancelBtn = findViewById<TextView>(R.id.cancelBtn)
        val nextBtn = findViewById<TextView>(R.id.nextBtn)
        val recentsBtn = findViewById<TextView>(R.id.recentsBtn)
        val selectMultipleBtn = findViewById<Button>(R.id.selectMultipleBtn)

        // Tab buttons
        val libraryTab = findViewById<TextView>(R.id.libraryTab)
        val photoTab = findViewById<TextView>(R.id.photoTab)
        val videoTab = findViewById<TextView>(R.id.videoTab)

        cancelBtn.setOnClickListener {
            finish()
        }

        nextBtn.setOnClickListener {
            // Handle next action
            finish()
        }
    }
}
