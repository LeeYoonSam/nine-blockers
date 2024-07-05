package com.ys.nineblockers.utils

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ys.nineblockers.components.CardContent

@Composable
fun List<String>.AddReverseCardContentComponent(visibleIndex: Int) {
    subList(0, visibleIndex + 1).reversed().forEach { label ->
        CardContent(label = label)
        Spacer(modifier = Modifier.height(16.dp))
    }
}