package com.mertlinux.bottomnavbardemo


import android.annotation.SuppressLint
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.mertlinux.bottomnavbardemo.graph.bottomNavGraph.BottomNavGraph


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen(){
    val navController =  rememberNavController()

    // Bottom Navigation Bar
   Scaffold(
        bottomBar = {BottomBar(navController = navController)}
    ){
        BottomNavGraph(navController = navController)
    }
}


@Composable
fun BottomBar(navController: NavController){
    // Bottom Navigation Bar
    val screens = listOf(
        BottomBarScreen.Home,
        BottomBarScreen.Profile,
        BottomBarScreen.Settings
    )
    val navBackStackEntry = navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry.value?.destination?.route

    NavigationBar {
        screens.forEach(){ screen ->
            AddItem(screen = screen, currentDestination = navBackStackEntry.value?.destination, navController = navController)
        }
    }
    }

@Composable
fun RowScope.AddItem(
    screen: BottomBarScreen,
    currentDestination: NavDestination?,
    navController: NavController
){

    NavigationBarItem(
        icon = { Icon(imageVector = screen.icon, contentDescription = "Navigation İcon") },
        label = { Text(screen.title) },
        selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true,
        onClick = { navController.navigate(screen.route){
            popUpTo(navController.graph.findStartDestination().id)
            launchSingleTop = true
        } },
        modifier = Modifier.alpha(if (currentDestination?.hierarchy?.any { it.route == screen.route } == true) 2f else 0.5f)
    )
}
