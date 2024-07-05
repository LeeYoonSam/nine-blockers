package com.ys.nineblockers.ui.mvp

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.ys.nineblockers.data.getMvpRecords
import com.ys.nineblockers.utils.AddCardContentComponent
import com.ys.nineblockers.utils.AddReverseCardContentComponent

@Composable
fun MvpScreen(navController: NavHostController) {
    var visibleIndex by remember { mutableIntStateOf(0) }

    val mvpRecords = getMvpRecords()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
            .clickable(
                enabled = visibleIndex < mvpRecords.size - 1
            ) {
                if (visibleIndex < mvpRecords.size - 1) {
                    visibleIndex++
                }
            },
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        mvpRecords.AddCardContentComponent(visibleIndex = visibleIndex)
    }
}