package com.example.activity2

import android.widget.EditText

interface Communicator {
    fun passData(
        nameData: String,
        secondData: String,
        emailData: String
        )
}