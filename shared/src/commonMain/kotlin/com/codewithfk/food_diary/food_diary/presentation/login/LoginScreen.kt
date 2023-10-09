package com.codewithfk.food_diary.food_diary.presentation.login

import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import dev.icerock.moko.mvvm.compose.getViewModel
import dev.icerock.moko.mvvm.compose.viewModelFactory

@Composable
fun LoginScreen() {
    val viewModel = getViewModel(key = "login", factory = viewModelFactory {
        LoginViewModel()
    })
    Scaffold {

        Button(onClick = {viewModel.loginWithGoogle()}){
            Text("Login with google test")
        }
    }
}