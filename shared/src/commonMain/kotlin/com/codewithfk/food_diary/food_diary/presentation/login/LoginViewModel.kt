package com.codewithfk.food_diary.food_diary.presentation.login

import dev.gitlive.firebase.Firebase
import dev.gitlive.firebase.auth.auth
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.launch

class LoginViewModel : ViewModel() {

    val firebaseAuth by lazy {
        Firebase.auth
    }

    fun loginWithGoogle() {
        viewModelScope.launch {
        val res =    firebaseAuth.signInWithEmailAndPassword("furqan@gmail.com","12345678")
            println(res.user.toString())
        }

    }

    fun loginWithApple() {

    }
}