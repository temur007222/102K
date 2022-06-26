package com.example.a101k

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.a102j.MainActivity
import com.example.a102j.R

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        initViews()
    }

    fun initViews() {
        val button = findViewById<Button>(R.id.sign_i1)
        button.setOnClickListener { openMainActivity() }
        val textView = findViewById<TextView>(R.id.tv)
        textView.setOnClickListener { openSignUpActivity() }
    }

    fun openMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun openSignUpActivity() {
        val intent = Intent(this, SignUpActivity::class.java)
        startActivity(intent)
    }
}