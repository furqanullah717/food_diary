package com.codewithfk.food_diary.android

import android.os.Bundle
import androidx.compose.foundation.isSystemInDarkTheme
import com.codewithfk.food_diary.di.AppModule
import com.codewithfk.food_diary.food_diary.App
import com.google.firebase.ktx.Firebase
import com.google.firebase.ktx.initialize
import moe.tlaster.precompose.lifecycle.PreComposeActivity
import moe.tlaster.precompose.lifecycle.setContent

class MainActivity : PreComposeActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val appModule = AppModule(this.applicationContext)
        Firebase.initialize(this) //
        setContent {
            App(
                darkTheme = isSystemInDarkTheme(),
                dynamicColor = true,
                appModule = appModule,
            )
        }
    }
}