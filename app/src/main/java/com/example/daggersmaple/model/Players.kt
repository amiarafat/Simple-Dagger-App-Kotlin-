package com.example.daggersmaple.model

import javax.inject.Inject

class Players @Inject constructor(){
    fun getPlayersName() : String {
        return "tamim, Liton,sakib,mushfiq,mahmudullah,miraz,saifuddin,mashrafee,mustafiz,rubel";
    }
}