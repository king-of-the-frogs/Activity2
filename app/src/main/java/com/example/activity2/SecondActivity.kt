package com.example.activity2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.activity2.R


class SecondActivity : AppCompatActivity() {

    private lateinit var textName: TextView
    private lateinit var textSecond: TextView
    private lateinit var textEmail: TextView
    private lateinit var okButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        textName = findViewById(R.id.tv_Name)
        textSecond = findViewById(R.id.tv_Second)
        textEmail = findViewById(R.id.tv_Email)
        okButton = findViewById(R.id.okButton)

        val name = intent.getStringExtra("name")
        val second = intent.getStringExtra("second")
        val email = intent.getStringExtra("email")



        textName.text = "" + name
        textSecond.text = "" + second
        textEmail.text = "" + email


       
    }
}



