package com.example.ZuhaakAhmad.i221352

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CameraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera)

        val captureBtn = findViewById<ImageView>(R.id.captureBtn)
        val galleryBtn = findViewById<ImageView>(R.id.galleryBtn)
        val flipBtn = findViewById<ImageView>(R.id.flipBtn)
        val flashBtn = findViewById<ImageView>(R.id.flashBtn)
        val photoCounter = findViewById<TextView>(R.id.photoCounter)
        val gridBtn = findViewById<ImageView>(R.id.gridBtn)

        // Camera mode buttons
        val typeBtn = findViewById<TextView>(R.id.typeBtn)
        val liveBtn = findViewById<TextView>(R.id.liveBtn)
        val normalBtn = findViewById<TextView>(R.id.normalBtn)
        val boomerangBtn = findViewById<TextView>(R.id.boomerangBtn)
        val superBtn = findViewById<TextView>(R.id.superBtn)

        captureBtn.setOnClickListener {
            // Handle photo capture
        }

        galleryBtn.setOnClickListener {
            finish()
        }
    }
}
