package com.example.daggersmaple.model

import javax.inject.Inject

class CoachRussel private constructor(){

    companion object{
        fun getCoachRusselInstance() : CoachRussel = CoachRussel()
    }
    fun getName() : String = "Russel Domingo"

    fun getSpeciality() : String = "Batting and Young player development"
}