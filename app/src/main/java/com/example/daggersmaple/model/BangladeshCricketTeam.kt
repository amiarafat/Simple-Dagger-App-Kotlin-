package com.example.daggersmaple.model

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class BangladeshCricketTeam @Inject constructor(val players: Players, val  coach: CoachRussel) {

   /* companion object{
        var instance : BangladeshCricketTeam ?= null

        @Synchronized
        fun getInstance(players: Players, coach: CoachRussel)  : BangladeshCricketTeam ?{

            if (instance == null){
                instance = BangladeshCricketTeam(players,coach)
            }

            return instance
        }
    }*/

    fun getMyBestEleven() : String = players.getPlayersName()

    fun getCoachName() : String = coach.getName()
}