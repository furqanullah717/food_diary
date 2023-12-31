package com.codewithfk.food_diary.food_diary


import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import com.codewithfk.food_diary.MR
import com.codewithfk.food_diary.core.presentation.stringResource
import com.codewithfk.food_diary.di.AppModule
import com.codewithfk.food_diary.food_diary.presentation.home.HomeScreen
import com.codewithfk.food_diary.food_diary.presentation.login.LoginScreen
import com.codewithfk.food_diary.food_diary.presentation.splash.SplashScreen
import com.codewithfk.food_diary.theme.AppTheme
import dev.gitlive.firebase.Firebase
import dev.gitlive.firebase.initialize
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.NavOptions
import moe.tlaster.precompose.navigation.PopUpTo
import moe.tlaster.precompose.navigation.rememberNavigator
import moe.tlaster.precompose.navigation.transition.NavTransition

@Composable
fun App(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    appModule: AppModule,
) {
    val navigator = rememberNavigator()
    AppTheme(
        darkTheme,
    ) {

        val home = stringResource(MR.strings.text_home)
        val showBottomBar = remember { mutableStateOf(false) }
        val selectedTab = remember { mutableStateOf(home) }
        Scaffold(bottomBar = {
            AnimatedVisibility(
                showBottomBar.value, enter = fadeIn(), exit = fadeOut()
            ) {
                BottomAppBar(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth()
                            .background(MaterialTheme.colorScheme.primary),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        BottomNavActionItem(
                            modifier = Modifier.weight(1f).fillMaxSize().clickable {
                                if (selectedTab.value != home) {
                                    navigator.navigate("/home")
                                    selectedTab.value = home
                                }
                            }, string = home, vector = Icons.Default.Home, selectedTab.value == home
                        )
                    }
                }
            }
        }) {
            NavHost(
                modifier = Modifier.padding(it),
                // Assign the navigator to the NavHost
                navigator = navigator,
                // Navigation transition for the scenes in this NavHost, this is optional
                navTransition = NavTransition(
                    createTransition = slideInHorizontally(),
                    destroyTransition = slideOutHorizontally()
                ),
                // The start destination
                initialRoute = "/login",
            ) {
                // Define a scene to the navigation graph
                scene(
                    // Scene's route path
                    route = "/splash",
                    // Navigation transition for this scene, this is optional
                ) {
                    showBottomBar.value = false
                    SplashScreen(
                        modifier = Modifier.fillMaxSize()
                            .background(MaterialTheme.colorScheme.primary),
                        onSplashEndedInvalid = {},
                        onSplashEndedValid = {
                            navigator.navigate(
                                "/home", NavOptions(popUpTo = PopUpTo("/splash", true))
                            )
                        },
                        onStart = {},
                        valid = true
                    )
                }
                scene(
                    // Scene's route path
                    route = "/login",
                    // Navigation transition for this scene, this is optional
                ) {
                    showBottomBar.value = false
                    LoginScreen()
                }
                scene(
                    // Scene's route path
                    route = "/home",
                    // Navigation transition for this scene, this is optional
                    navTransition = NavTransition(
                        createTransition = fadeIn(),
                        destroyTransition = fadeOut()
                    )
                ) {
                    showBottomBar.value = true
                    HomeScreen(appModule, navigator)
                }
            }
        }
    }
}

@Composable
fun BottomNavActionItem(modifier: Modifier, string: String, vector: ImageVector, b: Boolean) {
    val color =
        if (b) MaterialTheme.colorScheme.onTertiary else MaterialTheme.colorScheme.inversePrimary
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            imageVector = vector,
            contentDescription = string,
            modifier = Modifier,
            colorFilter = ColorFilter.tint(color)
        )
        Text(string, color = color)
    }

}