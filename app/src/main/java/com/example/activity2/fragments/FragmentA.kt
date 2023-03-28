package com.example.activity2.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.example.activity2.Communicator
import com.example.activity2.R

class FragmentA : Fragment() {

    private lateinit var communicator: Communicator
    private lateinit var edName: EditText
    private lateinit var edEmail: EditText

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_a, container, false)

        edName = view.findViewById(R.id.edName)
        edEmail = view.findViewById(R.id.edEmail)

        val btnNext: Button = view.findViewById(R.id.btnNext)
        btnNext.setOnClickListener {
            communicator.passData(edName.text.toString(), edEmail.text.toString())
        }

        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        communicator = context as Communicator
    }

    fun clearData() {
        edName.text.clear()
        edEmail.text.clear()
    }
}