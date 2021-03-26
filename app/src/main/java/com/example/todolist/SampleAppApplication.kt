package com.example.todolist

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class SampleAppApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        setupKoin()

    }

    private fun setupKoin() {
        startKoin {
            androidContext(this@SampleAppApplication)
        }

        ToDoListFeature.initKoinModules()
    }
}