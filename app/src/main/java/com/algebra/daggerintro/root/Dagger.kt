package com.algebra.daggerintro.root

import android.app.Application
import com.algebra.daggerintro.MainActivity
import dagger.Component

@Component( modules = [MojModul::class] )
interface AppComponent {
    fun inject( activity : MainActivity )
}

// appComponent lives in the Application class to share its lifecycle
class MyApplication : Application( ) {
    // Reference to the application graph that is used across the whole app
    val appComponent = DaggerAppComponent.create( )
}
