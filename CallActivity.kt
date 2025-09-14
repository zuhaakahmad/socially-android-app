package com.example.ZuhaakAhmad.i221352


import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CallActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_call)

        val endCallBtn = findViewById<ImageView>(R.id.endCallBtn)
        val speakerBtn = findViewById<ImageView>(R.id.speakerBtn)
        val muteBtn = findViewById<ImageView>(R.id.muteBtn)
        val timerText = findViewById<TextView>(R.id.timerText)

        endCallBtn.setOnClickListener {
            finish()
        }

        speakerBtn.setOnClickListener {
            // Handle speaker toggle
        }

        muteBtn.setOnClickListener {
            // Handle mute toggle
        }
    }
}
