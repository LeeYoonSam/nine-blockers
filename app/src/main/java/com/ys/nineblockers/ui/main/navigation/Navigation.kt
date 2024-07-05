package com.ys.nineblockers.ui.main.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.ys.nineblockers.ui.main.MainScreen

const val MAIN_ROUTE = "main"

fun NavGraphBuilder.mainScreen(navHostController: NavHostController) {
    composable(route = MAIN_ROUTE) {
        MainScreen(navHostController)
    }
}
