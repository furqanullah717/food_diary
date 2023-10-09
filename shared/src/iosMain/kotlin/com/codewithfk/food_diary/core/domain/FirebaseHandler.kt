package com.codewithfk.food_diary.core.domain

import dev.gitlive.firebase.Firebase
import dev.gitlive.firebase.FirebaseApp
import dev.gitlive.firebase.app

actual class FirebaseHandler {

    actual fun signInWithGoogle() {
    }

    actual fun signInWithFacebook() {
    }

    actual fun signInWithApple() {
    }

    actual fun signOut() {
    }

    actual fun getFirebaseApp(): FirebaseApp {
        return Firebase.app
    }

}