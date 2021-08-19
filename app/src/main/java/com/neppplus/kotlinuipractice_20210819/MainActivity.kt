package com.neppplus.kotlinuipractice_20210819

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moveToTextViewBtn.setOnClickListener {

//            입력한 메세지를 -> 변수에 저장해서 -> 텍스트뷰의 -> text속성으로 대입

            val inputMessage = messageEdt.text.toString()

            resultTxt.text = inputMessage

        }

        toastBtn.setOnClickListener {

//            입력한 메세지가 뭔지? 변수에 저장.
//            messageEdt의 text속성에 담겨있는 값을 => inputMessage 변수에 담자.
            val inputMessage = messageEdt.text.toString()

//            토스트로 inputMessage를 띄워주자.
            Toast.makeText(this, inputMessage, Toast.LENGTH_SHORT).show()

        }

    }
}