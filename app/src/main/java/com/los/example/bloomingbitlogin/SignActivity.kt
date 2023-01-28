package com.los.example.bloomingbitlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_sign.*

class SignActivity : AppCompatActivity() {

    val REQUEST_FOR_NICKNAME = 1005

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign)

        editNicknameBtn.setOnClickListener {

            val myIntent = Intent(this, EditNicknameActivity::class.java)
            startActivityForResult(myIntent,REQUEST_FOR_NICKNAME)
        }

        sendMessageBtn.setOnClickListener {

            // 타이핑한 내용을 받아와서 변수에 저장

            val inputMessage = emailIdEdt.text.toString()

            //비행기 티켓 발권
            val myIntent = Intent(this,MessageActivity::class.java)

            //수하물 첨부
            myIntent.putExtra("message", inputMessage)

            //비행기 출발
            startActivity(myIntent)
        }

        returnToMainBtn.setOnClickListener {

            val myIntent = Intent(this,MainActivity::class.java)
            startActivity(myIntent)
        }
    }
}