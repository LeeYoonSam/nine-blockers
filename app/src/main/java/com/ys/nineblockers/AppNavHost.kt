package com.ys.nineblockers

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.ys.nineblockers.ui.league.navigation.leagueScreen
import com.ys.nineblockers.ui.main.navigation.MAIN_ROUTE
import com.ys.nineblockers.ui.main.navigation.mainScreen
import com.ys.nineblockers.ui.mvp.navigation.mvpScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    startDestination: String = MAIN_ROUTE,
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination,
    ) {
        mainScreen(navController)
        leagueScreen(navController)
        mvpScreen(navController)
    }
}
