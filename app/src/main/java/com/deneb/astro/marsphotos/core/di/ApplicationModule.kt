package com.deneb.astro.marsphotos.core.di

import android.content.Context
import android.content.SharedPreferences
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val applicationModule = module {
    /*scope(named<ArticlesFragment>()){
        factory { ArticleAdapter() }
    }*/
    //factory { HeroesAdapter() }
    single<SharedPreferences> { androidContext().getSharedPreferences("SharedPreferences", Context.MODE_PRIVATE) }
}