package com.example.ZuhaakAhmad.i221352

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ExploreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explore)

        val searchBtn = findViewById<ImageView>(R.id.searchBtn)
        val reelsBtn = findViewById<ImageView>(R.id.reelsBtn)




        searchBtn.setOnClickListener {
            startActivity(Intent(this, SearchActivity::class.java))
        }


    }
}
