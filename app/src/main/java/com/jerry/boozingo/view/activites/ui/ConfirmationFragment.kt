package com.jerry.boozingo.view.activites.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jerry.boozingo.R
import com.jerry.boozingo.view.activites.MainActivity
import kotlinx.android.synthetic.main.fragment_confirmation.*

class ConfirmationFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_confirmation, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        continueButton.setOnClickListener {
            val intent = Intent(activity, MainActivity::class.java)
            activity?.startActivity(intent)
        }
    }

}