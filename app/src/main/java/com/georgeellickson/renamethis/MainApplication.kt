package com.georgeellickson.renamethis

import android.app.Application
import android.os.StrictMode
import android.os.StrictMode.ThreadPolicy.Builder

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        // init anything core

        // init Dagger

        // init 3rd party libs

        if (BuildConfig.DEBUG) {
            StrictMode.setThreadPolicy(
                Builder()
                    .detectDiskReads()
                    .detectDiskWrites()
                    .detectNetwork()
                    .penaltyLog()
                    .build()
            )
        }
    }
}