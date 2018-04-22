package com.development.james.myapplication.dagger

import com.development.james.myapplication.ui.main.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ AppModule::class ])
interface AppComponent {
    fun inject(target: MainActivity)
}
