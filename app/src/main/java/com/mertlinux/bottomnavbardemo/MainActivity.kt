package com.mertlinux.bottomnavbardemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.mertlinux.bottomnavbardemo.ui.theme.BottomNavBarDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottomNavBarDemoTheme {
                // A surface container using the 'background' color from the theme
                MainScreen()
            }
        }
    }
}
