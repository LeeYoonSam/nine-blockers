package com.ys.nineblockers.ui.main

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.ys.nineblockers.components.MenuButton
import com.ys.nineblockers.data.getMenus
import com.ys.nineblockers.ui.league.navigation.navigateToLeague
import com.ys.nineblockers.ui.mvp.navigation.navigateToMvp

@Composable
fun MainScreen(navController: NavHostController) {
    val menus: List<String> = getMenus()

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = "2024 상반기 리그 결과 🗣",
            style = MaterialTheme.typography.headlineLarge,
        )
        Spacer(modifier = Modifier.size(10.dp))
        Text(
            text = "모두들 고생 하셨습니다 🤗",
            style = MaterialTheme.typography.titleMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
        )
        Spacer(modifier = Modifier.size(50.dp))
        menus.mapIndexed { index, label ->
            MenuButton(label = label) {
                if (index == 0) {
                    navController.navigateToLeague()
                } else if (index == 1) {
                    navController.navigateToMvp()
                }
            }

            if (index != menus.lastIndex) {
                Spacer(modifier = Modifier.size(16.dp))
            }
        }
    }
}