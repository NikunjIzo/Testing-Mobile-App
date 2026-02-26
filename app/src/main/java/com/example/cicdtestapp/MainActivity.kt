package com.example.cicdtestapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cicdtestapp.ui.theme.CICDTestAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CICDTestAppTheme {
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
    var message by remember { mutableStateOf("Hello from whom 🤨 ") }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {

            Text(
                text = message,
                fontSize = 24.sp,
                modifier = Modifier.padding(bottom = 20.dp)
            )

            Button(onClick = {
                message = "This is a testing app for blabla 🙃 "
            }) {
                Text("click me 😀 ")
            }
        }
    }
}