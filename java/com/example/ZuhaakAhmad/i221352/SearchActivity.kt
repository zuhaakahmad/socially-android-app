package com.example.ZuhaakAhmad.i221352

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        val searchEditText = findViewById<EditText>(R.id.searchEditText)
        val clearBtn = findViewById<TextView>(R.id.clearBtn)

        // Tab buttons
        val topTab = findViewById<TextView>(R.id.topTab)
        val accountsTab = findViewById<TextView>(R.id.accountsTab)
        val tagsTab = findViewById<TextView>(R.id.tagsTab)
        val placesTab = findViewById<TextView>(R.id.placesTab)

        clearBtn.setOnClickListener {
            searchEditText.text.clear()
        }
    }
}
