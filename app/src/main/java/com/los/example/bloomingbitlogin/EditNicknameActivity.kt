package com.los.example.bloomingbitlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nickname.*

class EditNicknameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nickname)

        okBtn.setOnClickListener {

            //입력한 새 닉네임이 뭔지? 변수로 저장해서 사용한다.
            val inputNewNickname = newNicknameEdt.text.toString()

            //입력한 닉네임을 가지고 메인으로 복귀해야한다.
            //입력완료는 진짜 정의 / 백버튼은 돌아가는 것

            //입력한 닉네임을 담아주기 위한 용도로만 사용하는 Intent
            val resultIntent = Intent()
            resultIntent.putExtra("nickname", inputNewNickname)
            setResult(RESULT_OK, resultIntent)
            finish()

        }

    }
}