package com.example.ZuhaakAhmad.i221352


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NotificationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)

        val followingTab = findViewById<TextView>(R.id.followingTab)
        val youTab = findViewById<TextView>(R.id.youTab)
        val followRequestsBtn = findViewById<TextView>(R.id.followRequestsBtn)

        // Bottom navigation


        // Message buttons
        val messageBtn1 = findViewById<Button>(R.id.messageBtn1)
        val messageBtn2 = findViewById<Button>(R.id.messageBtn2)


        // Follow button
        val followBtn = findViewById<Button>(R.id.followBtn)



        messageBtn1.setOnClickListener {
            startActivity(Intent(this, ChatActivity::class.java))
        }
        messageBtn2.setOnClickListener {
            startActivity(Intent(this, ChatActivity::class.java))
        }

    }
}
