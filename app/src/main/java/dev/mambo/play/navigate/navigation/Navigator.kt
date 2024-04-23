package dev.mambo.play.navigate.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import dev.mambo.play.navigate.screens.ListDetailScreen
import dev.mambo.play.navigate.screens.ListScreen

/**
 * project : Navigate
 * date    : Tuesday 23/04/2024
 * user    : mambo
 * email   : mambobryan@gmail.com
 */
// TODO : 4 - declare a composable to handle all your navigation
@Composable
fun Navigator() {
    // TODO : 6 - declare a nav controller
    val navController = rememberNavController()

    // TODO : 7 - declare a nav host with a prefilled start destination
    NavHost(navController = navController, startDestination = Destinations.List.route) {

        // TODO : 8 - for each destination, add a route and the composable to show
        composable(route = Destinations.List.route) {
            ListScreen(navController = navController)
        }
        composable(
            route = Destinations.Detail.route,
            arguments = listOf(navArgument(Destinations.Detail.KEY) { type = NavType.IntType })
        ) {
            val id: Int? = it.arguments?.getInt(Destinations.Detail.KEY)
            ListDetailScreen(id = id, navController = navController)
        }
    }
}