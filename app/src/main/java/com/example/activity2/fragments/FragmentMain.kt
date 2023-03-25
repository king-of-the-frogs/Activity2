package com.example.activity2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.example.activity2.Communicator
import com.example.activity2.R

class FragmentMain : Fragment() {

    private lateinit var communicator: Communicator

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_main, container, false)
        val btn : Button = view.findViewById(R.id.btnNext)
        val edName : EditText = view.findViewById(R.id.edName)
        val edSecond : EditText = view.findViewById(R.id.edSecond)
        val edEmail : EditText = view.findViewById(R.id.edEmail)
        communicator = activity as Communicator
        btn.setOnClickListener {
            communicator.passData(edName.text.toString())
            communicator.passData(edSecond.text.toString())
            communicator.passData(edEmail.text.toString())
        }
        return view

    }

}