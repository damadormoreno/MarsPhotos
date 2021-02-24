package com.deneb.astro.marsphotos.core.di

import androidx.room.Room
import org.koin.dsl.module

val databaseModule = module {
    /*single {
        Room.databaseBuilder(
            get(),
            AppDatabase::class.java,
            "epicDB"
        )
            .build()
    }*/

    //factory { HeroesLocal(get()) }
}