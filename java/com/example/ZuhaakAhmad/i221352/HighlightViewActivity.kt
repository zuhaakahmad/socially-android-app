package com.example.ZuhaakAhmad.i221352


import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class HighlightViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_highlight_view)

        val closeBtn = findViewById<ImageView>(R.id.closeBtn)



        closeBtn.setOnClickListener {
            finish()
        }




    }
}
