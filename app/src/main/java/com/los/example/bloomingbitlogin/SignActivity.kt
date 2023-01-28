package com.los.example.bloomingbitlogin

import android.app.Activity
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

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        //돌아온 이유가 닉네임을 받으러 다녀온게 맞는지?
        if (requestCode == REQUEST_FOR_NICKNAME) {

            //추가질문 : 확인을 눌러서 돌아온게 맞는가?

            if (resultCode == Activity.RESULT_OK) {

                //실제 첨부된 새 닉네임을 꺼내서 텍스트뷰에 반영.

                val newNickname = data?.getStringExtra("nickname")
                nicknameTxt.text = newNickname
            }
        }
    }
}