package com.codewithfk.food_diary.di

import com.codewithfk.food_diary.core.domain.FirebaseHandler


expect class AppModule {
    fun getFirebaseHandler(): FirebaseHandler
}