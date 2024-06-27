package com.hello.shayriapp.routing

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.hello.shayriapp.presentation.CategoryScreen
import com.hello.shayriapp.presentation.ShayriListScreen
import com.hello.shayriapp.presentation.SplashScreen

@Composable
fun ShayriRouting(navHostController: NavHostController) {

    NavHost(navController = navHostController, startDestination = ShayriRoutingItems.SplashScreenItem.route) {
        composable(ShayriRoutingItems.CategoryScreenItem.route){
            CategoryScreen(navHostController)
        }
        composable(ShayriRoutingItems.SplashScreenItem.route){
            SplashScreen(navHostController)
        }
        composable(ShayriRoutingItems.ShayriListScreenItem.route){
            ShayriListScreen(navHostController)
        }

    }
}