package com.algebra.daggerintro.root

import com.algebra.daggerintro.Danas
import dagger.Module
import dagger.Provides
import java.util.Date

@Module
class MojModul {

    @Provides
    fun getDanasObject( ) : Danas {
        return Danas( Date( ) )
    }
}