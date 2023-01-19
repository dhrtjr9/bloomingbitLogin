package com.los.example.bloomingbitlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_sign.*

class SignActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign)

        returnToMainBtn.setOnClickListener {

            val myIntent = Intent(this,MainActivity::class.java)
            startActivity(myIntent)
        }
    }
}