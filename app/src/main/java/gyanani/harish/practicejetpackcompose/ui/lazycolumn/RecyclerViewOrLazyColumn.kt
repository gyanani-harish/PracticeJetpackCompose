package gyanani.harish.practicejetpackcompose.ui.lazycolumn

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ListScreen() {
    val items = listOf<String>("Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6", "Item 7", "Item 8", "Item 9", "Item 10", "Item 11", "Item 12", "Item 13", "Item 14", "Item 15", "Item 16", "Item 17", "Item 18", "Item 19", "Item 20")

    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(items) { item ->
            Text(
                text = item,
                fontSize = 18.sp,
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}