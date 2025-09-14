package com.example.ZuhaakAhmad.i221352

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NotificationFollowingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification_following)

        val followingTab = findViewById<TextView>(R.id.followingTab)
        val youTab = findViewById<TextView>(R.id.youTab)



        youTab.setOnClickListener {
            startActivity(Intent(this, NotificationActivity::class.java))
        }


    }
}
