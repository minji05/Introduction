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

        val intent = intent.getStringExtra("dataFromFirstActivity")
        val idText = findViewById<TextView>(R.id.idView)
        idText.text ="아이디 : ${intent}"

        val btn = findViewById<Button>(R.id.finishBtn)
        btn.setOnClickListener {
            finish()
        }

    }
}