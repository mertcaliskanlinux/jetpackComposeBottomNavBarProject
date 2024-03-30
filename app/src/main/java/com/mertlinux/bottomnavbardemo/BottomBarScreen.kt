package com.mertlinux.bottomnavbardemo

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Home : BottomBarScreen("home", "Home", Icons.Default.Home)
    object Profile : BottomBarScreen("profile", "Profile", Icons.Default.AccountCircle)
    object Settings : BottomBarScreen("settings", "Settings", Icons.Default.Settings)
}

