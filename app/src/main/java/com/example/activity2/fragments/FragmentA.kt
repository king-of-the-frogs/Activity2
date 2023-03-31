package com.example.activity2.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.activity2.R

class FragmentA : Fragment(R.layout.fragment_a) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val edName: EditText = requireActivity().findViewById(R.id.edName)
        val edSecond: EditText = requireActivity().findViewById(R.id.edSecond)
        val edEmail: EditText = requireActivity().findViewById(R.id.edEmail)
        val btnNext: Button = requireActivity().findViewById(R.id.btnNext)

        btnNext.setOnClickListener {
            if (edName.text.toString().isNotEmpty() &&
                edSecond.text.toString().isNotEmpty() &&
                edEmail.text.toString().isNotEmpty()
            ) {
                val bundle = Bundle().apply {
                    putString("name", edName.text.toString())
                    putString("second", edSecond.text.toString())
                    putString("email", edEmail.text.toString())
                }
                parentFragmentManager.beginTransaction().replace(R.id.container, FragmentB(bundle))
                    .commit()
            }
        }

    }
}