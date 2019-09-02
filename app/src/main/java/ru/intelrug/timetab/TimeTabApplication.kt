package ru.intelrug.timetab

import android.app.Application
import timber.log.Timber

class TimeTabApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}