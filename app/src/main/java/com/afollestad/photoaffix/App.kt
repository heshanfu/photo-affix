/*
 * Licensed under Apache-2.0
 *
 * Designed and developed by Aidan Follestad (@afollestad)
 */
package com.afollestad.photoaffix

import android.app.Application
import com.afollestad.photoaffix.di.AppComponent
import com.afollestad.photoaffix.di.DaggerAppComponent

/** @author Aidan Follestad (afollestad) */
class App : Application() {

  lateinit var appComponent: AppComponent

  override fun onCreate() {
    super.onCreate()
    appComponent = DaggerAppComponent.builder()
        .application(this)
        .build()
  }
}
