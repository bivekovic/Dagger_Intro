package com.algebra.daggerintro

import javax.inject.Inject

class Utils @Inject constructor( val matematika : Matematika, val konstante: Konstante, val danas: Danas ) {


    fun add( num1 : Int, num2 : Int ) : Int {
        return matematika.add( num1, num2 )
    }

    fun times( num1 : Int, num2 : Int ) : Int {
        return matematika.times( num1, num2 )
    }

    fun pi( ) : Double {
        return konstante.pi( )
    }

    fun danasJe( ) : String {
        return danas.danasJe( )
    }
}