package ru.asmelnikov.stokemarketapp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ru.asmelnikov.stokemarketapp.presentation.company_listings.CompanyListingsScreen

sealed class Screens(val rout: String) {
    object CompanyListingsScreen : Screens(rout = "listings_screen")
}

@Composable
fun SetupNavHost(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = Screens.CompanyListingsScreen.rout
    ) {

        composable(route = Screens.CompanyListingsScreen.rout) {
            CompanyListingsScreen(navController = navController)
        }
    }
}