package com.example.daggersmaple.di

import com.example.daggersmaple.App
import com.example.daggersmaple.di.module.ActivityBuilderModule
import com.example.daggersmaple.di.module.CoachModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule :: class,
        ActivityBuilderModule :: class,
        CoachModule :: class
    ]
)
interface AppComponent : AndroidInjector<App>