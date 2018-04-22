package com.development.james.myapplication.dagger

import com.development.james.myapplication.ui.main.MainActivity
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ActivityModule {

    @Provides
    @Singleton
    fun provideMainActivity(): MainActivity = MainActivity()
}