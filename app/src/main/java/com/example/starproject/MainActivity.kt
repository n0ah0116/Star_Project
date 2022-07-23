package com.example.starproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var number: EditText
    lateinit var result: TextView
    lateinit var resultBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        number = findViewById(R.id.number)
        resultBtn = findViewById(R.id.resultBtn)
        result = findViewById(R.id.result)

        resultBtn.setOnClickListener {
            val star: Int = number.text.toString().toInt()


            for (i in 1..star) {
                for (j in 1..i) {
                    result.text = ("로그를 확인하시오")
                    print("*")
                }
                println()
            }
        }

    }

}