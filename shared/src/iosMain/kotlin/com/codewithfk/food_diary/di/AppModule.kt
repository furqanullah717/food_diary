package com.codewithfk.food_diary.di

import com.codewithfk.food_diary.core.domain.FirebaseHandler


actual class AppModule {
    actual fun getFirebaseHandler(): FirebaseHandler {
        return FirebaseHandler()
    }


}