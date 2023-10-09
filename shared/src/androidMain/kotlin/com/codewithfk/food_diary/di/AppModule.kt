package com.codewithfk.food_diary.di

import android.content.Context
import com.codewithfk.food_diary.core.domain.FirebaseHandler


actual class AppModule(
    private val context: Context
) {
    actual fun getFirebaseHandler(): FirebaseHandler {
        return FirebaseHandler(context)
    }

}