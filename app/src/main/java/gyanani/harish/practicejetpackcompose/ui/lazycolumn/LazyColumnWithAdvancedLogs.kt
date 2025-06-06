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
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.DisposableEffect

@Composable
fun ListItemWithAdvancedLogs(index: Int, text: String) {
    Log.d("LazyColumn", "Composing item $index")
    Text(
        text = text,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    )

    DisposableEffect(Unit) {
        onDispose {
            Log.d("LazyColumn", "Disposing item $index") // When scrolled out of view
        }
    }
}