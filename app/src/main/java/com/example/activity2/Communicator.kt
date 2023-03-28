package com.example.activity2

import android.os.Bundle

interface Communicator {
    fun passData(name: String, email: String)
}