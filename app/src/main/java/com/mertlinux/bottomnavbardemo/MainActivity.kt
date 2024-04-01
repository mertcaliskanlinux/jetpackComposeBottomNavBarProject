package com.mertlinux.bottomnavbardemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.mertlinux.bottomnavbardemo.graph.RootNavGraph
import com.mertlinux.bottomnavbardemo.ui.theme.BottomNavBarDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottomNavBarDemoTheme {

                RootNavGraph(navController = rememberNavController())
            }
        }
    }
}
