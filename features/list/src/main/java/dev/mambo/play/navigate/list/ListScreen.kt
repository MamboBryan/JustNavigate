package dev.mambo.play.navigate.list

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * project : Navigate
 * date    : Tuesday 23/04/2024
 * user    : mambo
 * email   : mambobryan@gmail.com
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListScreen(onClickItem: (Int) -> Unit) {
    Scaffold(topBar = { TopAppBar(title = { Text(text = "Navigate") }) }) {
        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxSize()
        ) {
            LazyColumn {
                items(20) {
                    Card(
                        modifier = Modifier
                            .padding(8.dp)
                            .fillParentMaxWidth(),
                        onClick = { onClickItem.invoke(it) }
                    ) {
                        Text(modifier = Modifier.padding(16.dp), text = "$it", fontSize = 24.sp)
                    }
                }
            }
        }
    }
}