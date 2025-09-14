package com.example.ZuhaakAhmad.i221352

import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class StoryViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story_view)

        val closeBtn = findViewById<ImageView>(R.id.closeBtn)
        val sendMessageBtn = findViewById<LinearLayout>(R.id.sendMessageBtn)


        closeBtn.setOnClickListener {
            finish()
        }

        sendMessageBtn.setOnClickListener {
            // Handle send message
        }
    }
}
