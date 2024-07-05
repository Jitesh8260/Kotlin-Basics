package com.example.myfirstapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import com.example.myfirstapp.ui.theme.MyFirstAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstAppTheme {
                val lightBlue = Color(0xFFADD8E6)
                val purple = Color(0xFF800080)

                val gradientColors = listOf(Color.Cyan, lightBlue, purple, Color.Yellow)

                Text(
                    text = "WELCOME TO MY FIRST APP",
                    fontSize = 30.sp,
                    style = TextStyle(
                        brush = Brush.linearGradient(
                            colors = gradientColors
                        )
                    )
                )
            }
        }
    }

    override fun onStart() {
        super.onStart()
        println("LifeCycle:- On Create Started")
    }

    override fun onResume() {
        super.onResume()
        println("LifeCycle:- On Resume Started")
    }

    override fun onPause() {
        super.onPause()
        println("LifeCycle:- On Pause called")
    }

    override fun onStop() {
        super.onStop()
        println("LifeCycle:- On Stop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("LifeCycle:- On Destroy called")
    }
}



