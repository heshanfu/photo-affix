/*
 * Licensed under Apache-2.0
 *
 * Designed and developed by Aidan Follestad (@afollestad)
 */
package com.afollestad.photoaffix.di

import android.app.Application
import com.afollestad.photoaffix.components.SettingsLayout
import com.afollestad.photoaffix.dialogs.ImageSpacingDialog
import com.afollestad.photoaffix.views.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

/** @author Aidan Follestad (afollestad) */
@Singleton
@Component(modules = [AppModule::class, PrefsModule::class])
interface AppComponent {

  fun inject(mainActivity: MainActivity)

  fun inject(settingsLayout: SettingsLayout)

  fun inject(imageSpacingDialog: ImageSpacingDialog)

  @Component.Builder
  interface Builder {

    @BindsInstance fun application(application: Application): Builder

    fun build(): AppComponent
  }
}
