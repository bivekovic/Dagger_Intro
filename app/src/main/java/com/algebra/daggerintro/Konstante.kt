package com.algebra.daggerintro

import javax.inject.Inject

class Konstante @Inject constructor( ) {

    private val PI = 3.14

    fun pi( ) : Double {
        return PI
    }
}