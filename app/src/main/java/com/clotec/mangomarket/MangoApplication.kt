package com.clotec.mangomarket

import android.app.Application
import com.clotec.mangomarket.data.AppContainer
import com.clotec.mangomarket.data.AppContainerImpl

class MangoApplication : Application (){

    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppContainerImpl(this)
    }
}