package gyanani.harish.practicejetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

class MainActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAppTheme { // Optional: Wrap in a theme (if using Material Design)
                Greeting("Android") // Call your composable
            }
        }
    }
    @Composable
    fun Greeting(name: String) {
        Text(text = "Hello, $name!") // Displays "Hello, Android!"
    }
    @Composable
    fun MyAppTheme(content: @Composable () -> Unit) {
        MaterialTheme(
            colorScheme = darkColorScheme(), // Customize colors
            content = content
        )
    }
}