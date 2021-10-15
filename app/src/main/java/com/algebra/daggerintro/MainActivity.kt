package com.algebra.daggerintro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.algebra.daggerintro.root.MyApplication
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity( ) {

    @Inject
    lateinit var utils : Utils

    @Inject
    lateinit var toast : ToastService

    override fun onCreate( savedInstanceState: Bundle? ) {
        // Make Dagger instantiate @Inject fields in MainActivity
        ( applicationContext as MyApplication ).appComponent.inject( this )
        // Now objects are available

        super.onCreate( savedInstanceState )
        setContentView( R.layout.activity_main )

        setupListeners( )
    }

    private fun setupListeners( ) {
        bAdd.setOnClickListener {
            val res = utils.add( etBr1.text.toString( ).toInt( ), etBr2.text.toString( ).toInt( ) )
            toast.show( "Result: $res" )
        }

        bTimes.setOnClickListener {
            val res = utils.times( etBr1.text.toString( ).toInt( ), etBr2.text.toString( ).toInt( ) )
            toast.show( "Result: $res" )
        }

        bPi.setOnClickListener {
            toast.show( "Pi value: ${ utils.pi( ) }" )
        }

        bToast.setOnClickListener {
            toast.show( getString( R.string.app_name ) )
        }

        bDanas.setOnClickListener {
            toast.show( utils.danasJe( ) )
        }
    }

    override fun onResume( ) {
        super.onResume( )
        toast.ctx = this
    }
}