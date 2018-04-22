package com.development.james.myapplication.application

import android.app.Application
import com.development.james.myapplication.dagger.AppComponent
import com.development.james.myapplication.dagger.AppModule
import com.development.james.myapplication.dagger.DaggerAppComponent

class MainApplication : Application(){
    lateinit var appComponent: AppComponent

    private fun initDagger(app: MainApplication): AppComponent =
            DaggerAppComponent.builder()
                    .appModule(AppModule(app))
                    .build()

    override fun onCreate() {
        super.onCreate()
        appComponent = initDagger(this)
    }
}