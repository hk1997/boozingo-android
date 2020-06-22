package com.jerry.boozinga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    private val Splash_screenout:Long = 3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            //next activity wil start from here
            startActivity(Intent(this,ConfirmationActivity::class.java))

            //close this splash Activity
            finish()
        },Splash_screenout)

    }
}