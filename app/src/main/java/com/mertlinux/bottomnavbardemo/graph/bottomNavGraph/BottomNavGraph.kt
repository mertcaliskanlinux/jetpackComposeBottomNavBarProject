package com.mertlinux.bottomnavbardemo.graph.bottomNavGraph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.mertlinux.bottomnavbardemo.BottomBarScreen
import com.mertlinux.bottomnavbardemo.screen.HomeScreen
import com.mertlinux.bottomnavbardemo.screen.ProfileScreen
import com.mertlinux.bottomnavbardemo.screen.SettingsScreen


@Composable
fun BottomNavGraph(navController: NavHostController) {
    // Bottom Navigation Bar
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ){
        composable(BottomBarScreen.Home.route){
            HomeScreen()
        }
        composable(BottomBarScreen.Profile.route){
            ProfileScreen()
        }
        composable(BottomBarScreen.Settings.route){
            SettingsScreen()
        }
    }



}