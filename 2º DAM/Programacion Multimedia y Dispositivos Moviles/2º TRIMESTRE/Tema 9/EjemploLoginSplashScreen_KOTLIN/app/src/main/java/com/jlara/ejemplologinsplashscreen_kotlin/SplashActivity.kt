package com.jlara.ejemplologinsplashscreen_kotlin

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_EjemploLoginSplashScreen_KOTLIN)
        val intentLogin = Intent(this,LoginActivity::class.java)
        intentLogin.flags=Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        val intentMain = Intent(this,MainActivity::class.java)
        intentMain.flags=Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        val prefs:SharedPreferences=getSharedPreferences("app", Context.MODE_PRIVATE)
        if ((!TextUtils.isEmpty(prefs.getString("email",""))) &&
                (!TextUtils.isEmpty(prefs.getString("password",""))))
                    startActivity(intentMain)
        else
            startActivity(intentLogin)
        finish()
    }
}

