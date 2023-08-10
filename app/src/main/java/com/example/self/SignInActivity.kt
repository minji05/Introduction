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


        val loginbtn = findViewById<Button>(R.id.loginBtn)
        loginbtn.setOnClickListener {
            val idtext = findViewById<EditText>(R.id.idEditText)
            val pintext = findViewById<EditText>(R.id.pinidEditText)
            val idtextString = idtext.text.toString()
            val pintextString = pintext.text.toString()
            if (idtextString.isEmpty() || pintextString.isEmpty()) {
                Toast.makeText(this, "아이디/비밀번호를 확인해주세요.", Toast.LENGTH_LONG).show()

            } else{
                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("dataFromFirstActivity", idtextString)
                startActivity(intent)
                Toast.makeText(this, "로그인 성공", Toast.LENGTH_LONG).show()
            }

        }


    }


}