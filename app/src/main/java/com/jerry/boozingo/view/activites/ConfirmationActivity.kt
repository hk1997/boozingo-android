package com.jerry.boozingo.view.activites

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.jerry.boozingo.R

class ConfirmationActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        //add a 2 second delay here
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmation)

        navController = Navigation.findNavController(this, R.id.nav_initial_fragment)
        Log.e("Confirmation activity ", "code end")
    }
}