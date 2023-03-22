package com.example.activity2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.activity2.R


class MainActivity : AppCompatActivity() {

    private lateinit var btnNext: Button
    private lateinit var edName: EditText
    private lateinit var edSecond: EditText
    private lateinit var edEmail: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnNext = findViewById(R.id.btn_Next)
        edName = findViewById(R.id.ed_Name)
        edSecond = findViewById(R.id.ed_Second)
        edEmail = findViewById(R.id.ed_Email)

        btnNext.setOnClickListener {
            startActivity(
                Intent(this, SecondActivity::class.java)
                    .putExtra("name", edName.text.toString())
                    .putExtra("second", edSecond.text.toString())
                    .putExtra("email", edEmail.text.toString())
            )
        }


    }
}


