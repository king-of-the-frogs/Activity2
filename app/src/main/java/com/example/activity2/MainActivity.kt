package com.example.activity2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.activity2.fragments.FragmentMain
import com.example.activity2.fragments.FragmentSecond

class MainActivity: AppCompatActivity(), Communicator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentMain = FragmentMain()

        supportFragmentManager.beginTransaction().replace(R.id.fragment_container,fragmentMain)
            .commit()

    }

    override fun passData(nameData: String,secondData: String,emailData: String) {
        val bundle = Bundle()
        bundle.putString("name", nameData)
        bundle.putString("second", secondData)
        bundle.putString("email", emailData)

        val transaction = this.supportFragmentManager.beginTransaction()
        val fragmentSecond = FragmentSecond()

        fragmentSecond.arguments = bundle

        transaction.replace(R.id.fragment_container, fragmentSecond)
            .commit()
    }
}