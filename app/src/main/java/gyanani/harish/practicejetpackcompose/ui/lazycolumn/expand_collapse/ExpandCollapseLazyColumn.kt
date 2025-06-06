package gyanani.harish.practicejetpackcompose.ui.lazycolumn.expand_collapse

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.items

data class ExpandableItem(
    val title: String,
    val content: String
)

@Composable
fun ExpandableListScreen() {
    val items = remember {
        List(10) { index ->
            ExpandableItem(
                title = "Item $index",
                content = "Hidden content for item $index\n".repeat(3)
            )
        }
    }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()  // ← Key fix for status bar overlap
    ) {
        items(items) { item ->
            ExpandableItem(item)
        }
    }
}

@Composable
fun ExpandableItem(item: ExpandableItem) {
    var expanded by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        onClick = { expanded = !expanded }
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = item.title,
                style = MaterialTheme.typography.titleMedium
            )

            if (expanded) {
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = item.content,
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}