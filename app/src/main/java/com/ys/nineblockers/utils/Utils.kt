package com.ys.nineblockers.utils

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
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

@Composable
fun List<String>.AddCardContentComponent(visibleIndex: Int) {
    forEachIndexed { index, label ->
        if (index <= visibleIndex) {
            CardContent(label = label)
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Composable
fun List<String>.AddCardContentComponentWithTitleContent(visibleIndex: Int) {
    forEachIndexed { index, label ->
        if (index <= visibleIndex) {
            if (index % 2 == 1) {
                CardContent(
                    label = label,
                    textStyle = MaterialTheme.typography.headlineSmall,
                    textColor = MaterialTheme.colorScheme.secondary,
                )
            } else {
                CardContent(label = label)
            }
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}