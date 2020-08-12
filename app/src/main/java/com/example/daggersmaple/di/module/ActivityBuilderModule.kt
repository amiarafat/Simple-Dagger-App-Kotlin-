package com.example.daggersmaple.di.module

import com.example.daggersmaple.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector
    abstract fun  bindMainActivity() : MainActivity

}