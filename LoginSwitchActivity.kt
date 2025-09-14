package com.example.ZuhaakAhmad.i221352

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginSwitchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_switch)

        val loginBtn = findViewById<Button>(R.id.loginBtn)
        val switchAccountsText = findViewById<TextView>(R.id.switchAccountsText)
        val signUpText = findViewById<TextView>(R.id.signUpText)

        loginBtn.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }

        switchAccountsText.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

        signUpText.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }
    }
}
