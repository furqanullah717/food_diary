package com.codewithfk.food_diary.core.domain

import dev.gitlive.firebase.FirebaseApp


expect class FirebaseHandler {
    fun getFirebaseApp(): FirebaseApp
    fun signInWithGoogle()
    fun signInWithFacebook()

    fun signInWithApple()
    fun signOut()
}