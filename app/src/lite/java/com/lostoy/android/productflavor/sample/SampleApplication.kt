package com.lostoy.android.productflavor.sample

import android.app.Application
import android.content.Context

class SampleApplication: Application() {

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        ApplicationProxy.attachBaseContext(base)
    }

    override fun onCreate() {
        super.onCreate()
        ApplicationProxy.onCreate(this)
    }
}