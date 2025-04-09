package com.example.firstapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firstapp.ui.theme.FirstAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstAppTheme() {
                FIO(   name = "Ганикулов Давронбек Дониёр угли",
                    group = "ММ-41",
                    age = 21,
                    modifier = Modifier.padding())
            }
        }
    }
}

@Composable
fun FIO(name: String, group: String, age: Int, modifier: Modifier = Modifier) {
    Scaffold { innerPadding ->
        Box(
            modifier = Modifier
                .padding(innerPadding)
                .background(Color(0xFF4CAF50))
                .fillMaxSize()
        ) {
            Text(
                text = "Привет  \uD83D\uDC4B ! Меня зовут $name, я учусь в группе $group, мне $age!",
                modifier = modifier.padding(20.dp),
                style = MaterialTheme.typography.headlineMedium,
                color = Color.White
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FirstAppTheme(  ) {
        FIO(   name = "Ганикулов Давронбек Дониёр угли",
            group = "ММ-41",
            age = 21,
            modifier = Modifier.padding())
    }
}