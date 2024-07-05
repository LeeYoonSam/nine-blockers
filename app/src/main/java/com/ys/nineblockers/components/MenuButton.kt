package com.ys.nineblockers.components

import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun MenuButton(label: String, moveAction: () ->  Unit = {}) {
    OutlinedButton(
        onClick = moveAction,
        colors = ButtonDefaults.outlinedButtonColors(
            contentColor = MaterialTheme.colorScheme.primaryContainer,
            containerColor = MaterialTheme.colorScheme.primary
        )
    ) {
        Text(text = label, fontSize = 20.sp)
    }
}

@Preview
@Composable
fun PreviewMenuButton() {
    MenuButton(label = "Test")
}