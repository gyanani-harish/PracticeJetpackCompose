package gyanani.harish.practicejetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import gyanani.harish.practicejetpackcompose.ui.HelloWorldScreen
import gyanani.harish.practicejetpackcompose.ui.ListScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAppTheme {
                NavigationScreen() // Handles navigation between screens
            }
        }
    }
}

@Composable
fun MyAppTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = darkColorScheme(), // Customize colors
        content = content
    )
}

@Composable
fun NavigationScreen() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "main") {
        composable("main") { MainScreen(navController) } // Home screen with buttons
        composable("hello") { HelloWorldScreen() }       // Simple "Hello World"
        composable("list") { ListScreen() }             // RecyclerView equivalent
    }
}

@Composable
fun MainScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = { navController.navigate("hello") },
            modifier = Modifier.padding(16.dp)
        ) {
            Text("Open Hello World")
        }

        Button(
            onClick = { navController.navigate("list") },
            modifier = Modifier.padding(16.dp)
        ) {
            Text("Open RecyclerView")
        }
    }
}