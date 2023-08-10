package com.example.self

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //전달받은 데이터를 출력
        val intent = intent.getStringExtra("dataFromFirstActivity")
        val idText = findViewById<TextView>(R.id.idView)
        idText.text ="아이디 : ${intent}"


        //종료 버튼 누를 시
        val btn = findViewById<Button>(R.id.finishBtn)
        btn.setOnClickListener {
            finish()
        }

    }
}