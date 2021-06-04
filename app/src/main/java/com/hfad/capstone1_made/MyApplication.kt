package com.hfad.capstone1_made

import android.app.Application
import com.hfad.capstone1_made.core.di.databaseModule
import com.hfad.capstone1_made.core.di.networkModule
import com.hfad.capstone1_made.core.di.repositoryModule
import com.hfad.capstone1_made.di.useCaseModule
import com.hfad.capstone1_made.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@MyApplication)
            modules(
                listOf(
                    databaseModule,
                    networkModule,
                    repositoryModule,
                    useCaseModule,
                    viewModelModule
                )
            )
        }
    }
}