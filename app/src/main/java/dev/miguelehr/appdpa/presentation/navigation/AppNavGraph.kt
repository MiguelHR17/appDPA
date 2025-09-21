package dev.miguelehr.appdpa.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.miguelehr.appdpa.presentation.auth.LoginScreen
import dev.miguelehr.appdpa.presentation.auth.RegisterScreen
import dev.miguelehr.appdpa.presentation.home.HomeScreen

@Composable
fun AppNavGraph() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "register")
    {
        composable("register") { RegisterScreen(navController) }
        composable("login") { LoginScreen(navController) }
        composable("home") { HomeScreen() }
    }
}