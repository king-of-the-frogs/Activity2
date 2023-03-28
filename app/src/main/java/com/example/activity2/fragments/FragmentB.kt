package com.example.activity2.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.activity2.Communicator
import com.example.activity2.MainActivity
import com.example.activity2.R

class FragmentB : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_b, container, false)

        val tvName = view.findViewById<TextView>(R.id.tvName)
        val tvEmail = view.findViewById<TextView>(R.id.tvEmail)
        val btnDel = view.findViewById<Button>(R.id.btnDel)
        val bundle = arguments
        if (bundle != null) {
            val name = bundle.getString("name")
            val email = bundle.getString("email")

            tvName.text = name
            tvEmail.text = email
        }

        btnDel.setOnClickListener {
            val fragmentA = requireActivity().supportFragmentManager.findFragmentById(R.id.fragmentA) as FragmentA
            fragmentA.clearData()
        }

        return view
    }


}