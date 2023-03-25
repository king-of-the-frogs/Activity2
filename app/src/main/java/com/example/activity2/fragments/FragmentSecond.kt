package com.example.activity2.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.activity2.R

class FragmentSecond : Fragment() {

    private var output1: String? = ""
    private var output2: String? = ""
    private var output3: String? = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        val tvName: EditText = view.findViewById(R.id.tvName)
        val tvSecond: EditText = view.findViewById(R.id.tvSecond)
        val tvEmail: EditText = view.findViewById(R.id.tvEmail)
        output1 = arguments?.getString("name")
        output2 = arguments?.getString("second")
        output3 = arguments?.getString("email")
        tvName.text = output1
        tvSecond.text = output2
        tvEmail.text = output3
        return view
    }
}