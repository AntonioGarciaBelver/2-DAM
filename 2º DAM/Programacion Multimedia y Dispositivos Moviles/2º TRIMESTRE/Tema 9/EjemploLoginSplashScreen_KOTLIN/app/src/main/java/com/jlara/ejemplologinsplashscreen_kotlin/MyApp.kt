package com.jlara.ejemplologinsplashscreen_kotlin

import android.app.Application
import android.os.SystemClock

class MyApp: Application() {
    override fun onCreate() {
        super.onCreate()
        SystemClock.sleep(3000)
    }
}

