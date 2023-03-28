package com.example.activity2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.activity2.fragments.FragmentA
import com.example.activity2.fragments.FragmentB

class MainActivity : AppCompatActivity(), Communicator {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Создание и добавление FragmentA в контейнер
        val fragmentA = FragmentA()
        supportFragmentManager.beginTransaction()
            .add(R.id.container, fragmentA)
            .commit()
    }

    // Реализация метода интерфейса Communicator для передачи данных от FragmentA к FragmentB
    override fun passData(name: String, email: String) {
        val bundle = Bundle()
        bundle.putString("name", name)
        bundle.putString("email", email)

        val fragmentB = FragmentB()
        fragmentB.arguments = bundle

        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragmentB)
            .addToBackStack(null)
            .commit()
    }

    fun clearDataInFragmentA() {
        val fragmentA = supportFragmentManager.findFragmentById(R.id.container) as? FragmentA
        fragmentA?.clearData()
    }

}