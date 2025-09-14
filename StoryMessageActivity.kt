package com.example.ZuhaakAhmad.i221352


import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class StoryMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story_message)

        val closeBtn = findViewById<ImageView>(R.id.closeBtn)
        val sendBtn = findViewById<ImageView>(R.id.sendBtn)
        val moreBtn = findViewById<ImageView>(R.id.moreBtn)
        val messageInput = findViewById<EditText>(R.id.messageInput)

        closeBtn.setOnClickListener {
            finish()
        }

        sendBtn.setOnClickListener {
            // Handle send message
            messageInput.text.clear()
        }

        moreBtn.setOnClickListener {
            // Handle more options
        }
    }
}
