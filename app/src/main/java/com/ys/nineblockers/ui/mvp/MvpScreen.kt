package com.ys.nineblockers.ui.mvp

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun MvpScreen(navController: NavHostController) {
    Column {
        Text(text = "MVP 화면")
    }
}