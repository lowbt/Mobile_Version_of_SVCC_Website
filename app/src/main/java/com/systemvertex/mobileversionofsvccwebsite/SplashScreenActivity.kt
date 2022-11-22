package com.systemvertex.mobileversionofsvccwebsite

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

@Suppress("DEPRECATION")
class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val splashScreenTimeOut = 4000
        val homeIntent = Intent(this@SplashScreenActivity, MainActivity::class.java)

        Handler().postDelayed({
            startActivity(homeIntent)
            finish()
        }, splashScreenTimeOut.toLong())

    }
}