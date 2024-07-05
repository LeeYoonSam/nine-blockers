package com.ys.nineblockers.ui.league.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.ys.nineblockers.ui.league.LeagueScreen

const val LEAGUE_ROUTE = "league"

fun NavGraphBuilder.leagueScreen(navController: NavHostController) {
    composable(route = LEAGUE_ROUTE) {
        LeagueScreen(navController)
    }
}

fun NavHostController.navigateToLeague() = this.navigate(LEAGUE_ROUTE)
