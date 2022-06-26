package com.example.a101k

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.a102j.MainActivity
import com.example.a102j.R

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        initViews()
    }


    fun initViews() {
        val button = findViewById<Button>(R.id.sign_up)
        button.setOnClickListener { openMainActivity() }

        val textView:TextView = findViewById(R.id.tv)
        textView.setOnClickListener(View.OnClickListener { openSignInActivity() })
    }

    fun openMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun openSignInActivity(){
        val intent = Intent(this, SignInActivity::class.java)
        startActivity(intent)
    }
}