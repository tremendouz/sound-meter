package com.example.dawid.soundmeter.di

import com.example.dawid.soundmeter.MainActivity
import com.example.dawid.soundmeter.di.modules.AndroidModule
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by dawid on 12.03.18.
 */

@Singleton
@Component(modules = arrayOf(AndroidModule::class,
        AndroidSupportInjectionModule::class))
interface ApplicationComponent {
    fun inject(activity: MainActivity)
}