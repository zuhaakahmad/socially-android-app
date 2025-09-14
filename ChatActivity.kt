package com.example.ZuhaakAhmad.i221352

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ChatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        val backBtn = findViewById<ImageView>(R.id.backBtn)
        val videoCallBtn = findViewById<ImageView>(R.id.videoCallBtn)
        val infoBtn = findViewById<ImageView>(R.id.infoBtn)
        val messageInput = findViewById<EditText>(R.id.messageInput)
        val sendBtn = findViewById<ImageView>(R.id.sendBtn)
        val cameraBtn = findViewById<ImageView>(R.id.cameraBtn)
        val micBtn = findViewById<ImageView>(R.id.micBtn)
        val imageBtn = findViewById<ImageView>(R.id.imageBtn)
        val stickerBtn = findViewById<ImageView>(R.id.stickerBtn)

        backBtn.setOnClickListener {
            finish()
        }

        videoCallBtn.setOnClickListener {
            startActivity(Intent(this, CallActivity::class.java))
        }

        sendBtn.setOnClickListener {
            // Handle send message
            messageInput.text.clear()
        }

        cameraBtn.setOnClickListener {
            startActivity(Intent(this, CameraActivity::class.java))
        }

        imageBtn.setOnClickListener {
            startActivity(Intent(this, GalleryActivity::class.java))
        }
    }
}
