package com.example.self


import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Random


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val photos =
            intArrayOf(R.drawable.love, R.drawable.amazed, R.drawable.anger, R.drawable.crying, R.drawable.smile)
       //랜덤 이미지 출력
        val image = findViewById<View>(R.id.imageView) as ImageView
        val random = Random()
        val i: Int = random.nextInt(photos.size)
        image.setImageResource(photos[i])

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