package com.ys.nineblockers.ui.mvp.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.ys.nineblockers.ui.mvp.MvpScreen

const val MVP_ROUTE = "mvp"

fun NavGraphBuilder.mvpScreen(navController: NavHostController) {
    composable(route = MVP_ROUTE) {
        MvpScreen(navController)
    }
}

fun NavHostController.navigateToMvp() = this.navigate(MVP_ROUTE)
