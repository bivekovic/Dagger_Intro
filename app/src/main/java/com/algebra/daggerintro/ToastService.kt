package com.algebra.daggerintro

import android.content.Context
import android.widget.Toast
import javax.inject.Inject

class ToastService @Inject constructor(  ) {

    var ctx : MainActivity? = null

    fun show( text : String ) {
        Toast
            .makeText( ctx, text, Toast.LENGTH_SHORT )
            .show( )
    }
}