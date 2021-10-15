package com.algebra.daggerintro

import javax.inject.Inject

class Matematika @Inject constructor( ) {

    fun add( num1 : Int, num2 : Int ) : Int {
        return num1 + num2
    }

    fun times( num1 : Int, num2 : Int ) : Int {
        return num1 * num2
    }
}