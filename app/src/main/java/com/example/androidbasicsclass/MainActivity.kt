package com.example.androidbasicsclass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.androidbasicsclass.ui.login.view.LoginView  // ← cambio
import com.example.androidbasicsclass.ui.theme.AndroidBasicsClassTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidBasicsClassTheme {
                LoginView()  // ← cambio
            }
        }
    }
}