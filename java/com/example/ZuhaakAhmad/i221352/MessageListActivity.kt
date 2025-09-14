package com.example.ZuhaakAhmad.i221352

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class MessageListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message_list)

        val backBtn = findViewById<ImageView>(R.id.backBtn)
        val addBtn = findViewById<ImageView>(R.id.addBtn)
        val cameraBtn = findViewById<ImageView>(R.id.cameraBtn)

        // Message items
        val message1 = findViewById<LinearLayout>(R.id.message1)
        val message2 = findViewById<LinearLayout>(R.id.message2)
        val message3 = findViewById<LinearLayout>(R.id.message3)
        val message4 = findViewById<LinearLayout>(R.id.message4)
        val message5 = findViewById<LinearLayout>(R.id.message5)
        val message6 = findViewById<LinearLayout>(R.id.message6)

        backBtn.setOnClickListener {
            finish()
        }

        cameraBtn.setOnClickListener {
            startActivity(Intent(this, CameraActivity::class.java))
        }

        message1.setOnClickListener {
            startActivity(Intent(this, ChatActivity::class.java))
        }
        message2.setOnClickListener {
            startActivity(Intent(this, ChatActivity::class.java))
        }
        message3.setOnClickListener {
            startActivity(Intent(this, ChatActivity::class.java))
        }
        message4.setOnClickListener {
            startActivity(Intent(this, ChatActivity::class.java))
        }
        message5.setOnClickListener {
            startActivity(Intent(this, ChatActivity::class.java))
        }
        message6.setOnClickListener {
            startActivity(Intent(this, ChatActivity::class.java))
        }
    }
}
