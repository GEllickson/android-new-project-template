package com.georgeellickson.renamethis

import android.app.Application
import android.os.StrictMode
import android.os.StrictMode.ThreadPolicy.Builder
import com.georgeellickson.renamethis.di.AppComponent
import com.georgeellickson.renamethis.di.DaggerAppComponent
import timber.log.Timber
import timber.log.Timber.DebugTree

class MainApplication : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        // init anything core, Dagger, 3rd party libs, etc.
        appComponent = DaggerAppComponent.factory().create(this)

        if (BuildConfig.DEBUG) {
            StrictMode.setThreadPolicy(
                Builder()
                    .detectDiskReads()
                    .detectDiskWrites()
                    .detectNetwork()
                    .penaltyLog()
                    .build()
            )

            Timber.plant(DebugTree())
        }
    }
}

val Application.appComponent: AppComponent
    get() = (this as MainApplication).appComponent