package com.ys.nineblockers.ui.league

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.ys.nineblockers.data.getLeagueRecords
import com.ys.nineblockers.utils.AddReverseCardContentComponent

@Composable
fun LeagueScreen(navController: NavHostController) {
    var visibleIndex by remember { mutableIntStateOf(0) }

    val leagueRecords = getLeagueRecords()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
            .clickable(
                enabled = visibleIndex < leagueRecords.size - 1
            ) {
                if (visibleIndex < leagueRecords.size - 1) {
                    visibleIndex++
                }
            },
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "2024 상반기 리그 시상 🗣",
            style = MaterialTheme.typography.headlineLarge,
        )
        Spacer(modifier = Modifier.size(24.dp))

        leagueRecords.AddReverseCardContentComponent(visibleIndex = visibleIndex)
    }
}