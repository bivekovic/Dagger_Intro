package com.algebra.daggerintro

import java.text.SimpleDateFormat
import java.util.Date
import javax.inject.Inject

class Danas @Inject constructor ( val datum : Date ) {

    fun danasJe( ) : String {
        val sdf = SimpleDateFormat( "dd.MM.yyyy." )
        return "Danas je: ${sdf.format( datum )}"
    }
}