package com.lostoy.android.productflavor.sample

import android.content.Context
import androidx.multidex.MultiDexApplication
import com.didichuxing.doraemonkit.DoKit

class SampleApplication: MultiDexApplication() {

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        ApplicationProxy.attachBaseContext(base)
    }

    override fun onCreate() {
        super.onCreate()

        DoKit.Builder(this)
            .productId("8888888")
            .build()

        ApplicationProxy.onCreate(this)
    }
}