package com.codewithfk.food_diary.core.domain

import android.content.Context
import dev.gitlive.firebase.Firebase
import dev.gitlive.firebase.FirebaseApp
import dev.gitlive.firebase.app


actual class FirebaseHandler(private val context: Context) {
    actual fun getFirebaseApp(): FirebaseApp {
       return Firebase.app
    }

    actual fun signInWithGoogle() {
    }

    actual fun signInWithFacebook() {
    }

    actual fun signInWithApple() {
    }

    actual fun signOut() {
    }

}