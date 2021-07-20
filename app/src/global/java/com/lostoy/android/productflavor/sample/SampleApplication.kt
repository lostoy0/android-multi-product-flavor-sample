package com.lostoy.android.productflavor.sample

import android.content.Context
import androidx.multidex.MultiDexApplication

class SampleApplication: MultiDexApplication() {

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        ApplicationProxy.attachBaseContext(base)
    }

    override fun onCreate() {
        super.onCreate()
        ApplicationProxy.onCreate(this)
    }
}