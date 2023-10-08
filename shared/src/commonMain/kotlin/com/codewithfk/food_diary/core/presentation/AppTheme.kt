package com.codewithfk.food_diary.core.presentation

import androidx.compose.runtime.Composable
@Composable
expect fun AppTheme(isDarkMode:Boolean ,content: @Composable () -> Unit)