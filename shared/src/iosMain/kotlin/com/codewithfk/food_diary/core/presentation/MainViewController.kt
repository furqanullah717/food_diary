package com.codewithfk.food_diary.core.presentation


import com.codewithfk.food_diary.di.AppModule
import com.codewithfk.food_diary.food_diary.App
import moe.tlaster.precompose.PreComposeApplication
import platform.UIKit.UIScreen
import platform.UIKit.UIUserInterfaceStyle

fun MainViewController() = PreComposeApplication() {
    val isDarkTheme =
        UIScreen.mainScreen.traitCollection.userInterfaceStyle ==
                UIUserInterfaceStyle.UIUserInterfaceStyleDark
    App(
        darkTheme  = isDarkTheme,
        dynamicColor = false,
        appModule = AppModule(),
    )
}