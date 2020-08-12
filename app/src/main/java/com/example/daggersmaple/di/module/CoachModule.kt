package com.example.daggersmaple.di.module

import com.example.daggersmaple.model.CoachRussel
import dagger.Module
import dagger.Provides

@Module
class CoachModule {

    @Provides
    fun getCoachRussel() : CoachRussel = CoachRussel.getCoachRusselInstance()
}