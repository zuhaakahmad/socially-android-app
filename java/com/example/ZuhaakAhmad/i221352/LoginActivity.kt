package com.example.ZuhaakAhmad.i221352

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Find all views
        val backBtn = findViewById<ImageView>(R.id.backBtn)
        val usernameEditText = findViewById<EditText>(R.id.usernameEditText)
        val passwordEditText = findViewById<EditText>(R.id.passwordEditText)
        val forgotPasswordBtn = findViewById<TextView>(R.id.forgotPasswordBtn)
        val loginBtn = findViewById<Button>(R.id.loginBtn)
        val signUpText = findViewById<TextView>(R.id.signUpText)
        val switchAccountsBtn = findViewById<Button>(R.id.switchAccountsBtn)

        // Back button click
        backBtn.setOnClickListener {
            finish() // Go back to previous activity
        }

        // Login button click - go to HomeActivity
        loginBtn.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish() // Close login activity
        }

        // Sign up text click - go to SignUpActivity
        signUpText.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

        // Switch accounts button click - also go to SignUpActivity
        switchAccountsBtn.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

        // Forgot password click
        forgotPasswordBtn.setOnClickListener {
            // You can add forgot password functionality here
            // For now, let's navigate to ProfileActivity as a placeholder
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}