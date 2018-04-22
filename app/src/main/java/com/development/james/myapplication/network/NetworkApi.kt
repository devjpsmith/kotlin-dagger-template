package com.development.james.myapplication.network

import android.content.Context
import dagger.Module
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NetworkApi: INetworkApi {

    var mContext: Context

    @Inject
    constructor(context: Context) {
        mContext = context
    }

    override fun validateInput(input: String): Boolean = mContext.packageName.isNotEmpty() && input.isNotEmpty()
}