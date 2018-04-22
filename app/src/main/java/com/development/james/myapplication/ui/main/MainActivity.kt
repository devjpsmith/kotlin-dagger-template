package com.development.james.myapplication.ui.main

import android.app.Activity
import android.os.Bundle
import android.util.Log
import com.development.james.myapplication.R
import com.development.james.myapplication.application.MainApplication
import com.development.james.myapplication.network.INetworkApi
import com.development.james.myapplication.network.NetworkApi
import javax.inject.Inject

class MainActivity : Activity() {

    private val TAG: String = "MainActivity"

    @Inject
    lateinit var mNetworkApi: NetworkApi

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as MainApplication).appComponent.inject(this)

        Log.d(TAG, "Dependency Injection worked: "
            + mNetworkApi.validateInput("hello world"))
    }
}
