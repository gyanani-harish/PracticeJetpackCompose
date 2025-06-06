package gyanani.harish.practicejetpackcompose.ui.lazycolumn
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import android.util.Log
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.DisposableEffect

@Composable
fun ListScreenWithLogs() {
    val items = List(100) { "Item ${it + 1}" } // 100 items for demo

    LazyColumn(modifier = Modifier.fillMaxSize()) {
        itemsIndexed(items) { index, item ->
            Log.d("LazyColumn", "Initializing item $index") // Log when item is composed
            Text(
                text = item,
                fontSize = 18.sp,
                modifier = Modifier.padding(16.dp)
            )
            DisposableEffect(Unit) {
                onDispose {
                    Log.d("LazyColumn", "Disposing item $index") // When scrolled out of view
                }
            }
        }
    }
}