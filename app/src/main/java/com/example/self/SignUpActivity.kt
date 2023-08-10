package com.example.self

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        //회원가입 버튼 누를 시
        val signBtn = findViewById<Button>(R.id.signBtn)
        signBtn.setOnClickListener {
            val nametext = findViewById<EditText>(R.id.nameEditText)
            val idtext = findViewById<EditText>(R.id.idEditText)
            val pintext = findViewById<EditText>(R.id.pinidEditText)

            val idtextString = idtext.text.toString()
            val pintextString = pintext.text.toString()
            val nametextString = nametext.text.toString()

            //셋 중 하나라도 비어있으면 토스트 메세지 출력
            if (idtextString.isEmpty() || pintextString.isEmpty() || nametextString.isEmpty()) {
                Toast.makeText(this, "입력되지 않은 정보가 있습니다.", Toast.LENGTH_LONG).show()

            } else {
                //제대로 입력되면 SignInActivity로 이동
                val intent = Intent(this, SignInActivity::class.java)
                startActivity(intent)
                finish()
            }

        }


    }
}