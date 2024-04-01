package com.mertlinux.bottomnavbardemo.screen.home

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.mertlinux.bottomnavbardemo.BottomBar
import com.mertlinux.bottomnavbardemo.graph.HomeNavGraph


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavHostController = rememberNavController()) {
    Scaffold(bottomBar = {BottomBar(navController = navController)})
    {

        HomeNavGraph(navController = navController)


    }
}



@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}


