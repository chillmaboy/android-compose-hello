package com.example.hello

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hello.ui.theme.HelloTheme

/**
 * Главная Activity приложения на Jetpack Compose.
 * @author Кологривко Никита Сергеевич (ПИН-Б-О-24-1)
 * @version 1.0
 * @since 2026-09-30
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingScreen(
                        name = "Кологривко Никита Сергеевич",
                        group = "ПИН-Б-О-24-1"
                    )
                }
            }
        }
    }
}

/**
 * Composable-функция главного экрана.
 * @param name Имя студента
 * @param group Учебная группа
 * @param modifier Модификатор внешнего вида
 */
@Composable
fun GreetingScreen(
    name: String,
    group: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Моё первое приложение",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = name,
            fontSize = 18.sp,
            color = Color(0xFF1565C0) // синий цвет
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Группа $group",
            fontSize = 16.sp,
            color = Color.Gray
        )
        Spacer(modifier = Modifier.height(32.dp))
        Button(onClick = { /* пока ничего */ }) {
            Text("Нажми меня")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HelloTheme {
        GreetingScreen(
            name = "Кологривко Никита Сергеевич",
            group = "ПИН-Б-О-24-1"
        )
    }
}