package com.los.example.bloomingbitlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    loginBtn.setOnClickListener {

        //아이디 입력값, 비번 입력값을 각각의 변수에 저장.
        
        val inputId = idEdt.text.toString()
        val inputPw = passwordEdt.text.toString()

        // 다른 화면으로 이동 (SignActivity)
        moveToOtherBtn.setOnClickListener {

            val myIntent = Intent(this, SignActivity::class.java)
            startActivity(myIntent)
        //출발지 : this / 도착액티비티 :: class.java
        //실제로는 액티비티 이동이 아니라, 새 핵티비티를 하나 더 만들어서 기존의 액티비티 위에 얹어주는 기능이다.
        }

        //두개의 변수에 들어있는 값 검사. (맞는 아이디/비번)
        //맞을때 -> 틀릴때 분기처리. (if 문 처리)
        
        if (inputId == "admin@test.com" && inputPw == "qwer") {
            
            //둘다 맞나면 -> 관리자 입니다 토스트 팝업
            val name = "프로덕트 매니저"

            Toast.makeText(this, "${name} 관리자입니다.", Toast.LENGTH_SHORT).show()
            
        }
        else {
            //아이디 내지는 비번 중 하나라도 틀리면 로그인 실패 토스트
            Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show()
            }


        }
    }
}