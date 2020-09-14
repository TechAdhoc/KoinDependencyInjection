package com.techadhoc.koindependencyinjection

import android.app.Application
import org.koin.android.ext.android.startKoin

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startMyKoin()
    }

    private fun startMyKoin() = startKoin()

    private fun startKoin() = apply {
        startKoin(this, listOf(appModule))

    }
}