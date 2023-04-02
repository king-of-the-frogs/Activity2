package com.example.activity2.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.activity2.R

class FragmentB(bundle: Bundle) : Fragment(R.layout.fragment_b) {

    private lateinit var tvName: TextView
    private lateinit var tvSecond: TextView
    private lateinit var tvEmail: TextView
    private var btnDel: Button? = null
    private var name: String? = null
    private var second: String? = null
    private var email: String? = null

    init {
        name = bundle.getString("name")
        second = bundle.getString("second")
        email = bundle.getString("email")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvName = requireView().findViewById(R.id.tvName)
        tvSecond = requireView().findViewById(R.id.tvSecond)
        tvEmail = requireView().findViewById(R.id.tvEmail)
        btnDel = requireView().findViewById(R.id.btnDel)

        btnDel?.setOnClickListener {
            name = null
            second = null
            email = null
            showData()
            parentFragmentManager.beginTransaction().replace(R.id.container, FragmentA())
                .commit()
        }

        showData()
    }


    private fun showData() {
        tvName.text = name ?: ""
        tvSecond.text = second ?: ""
        tvEmail.text = email ?: ""
    }

}