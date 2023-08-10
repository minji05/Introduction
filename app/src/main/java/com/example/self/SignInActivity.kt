package com.example.self

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        //로그인 버튼 누를 시
        val loginbtn = findViewById<Button>(R.id.loginBtn)
        loginbtn.setOnClickListener {

            val idtext = findViewById<EditText>(R.id.idEditText)
            val pintext = findViewById<EditText>(R.id.pinidEditText)

            val idtextString = idtext.text.toString()
            val pintextString = pintext.text.toString()

            //아이디/비밀번호 중 하나라도 비어 있다면 토스트 메세지 출력
            if (idtextString.isEmpty() || pintextString.isEmpty()) {
                Toast.makeText(this, "아이디/비밀번호를 확인해주세요.", Toast.LENGTH_LONG).show()

            } else {
                //HomeActivity로 데이터 전달
                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("dataFromFirstActivity", idtextString)
                startActivity(intent)
                //성공 시 토스트 메세지 띄우기
                Toast.makeText(this, "로그인 성공", Toast.LENGTH_LONG).show()
            }

        }
        
        //회원가입 버튼 누를 시
        val signBtn = findViewById<Button>(R.id.signBtn)
        signBtn.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }


    }


}