package com.oguzavanoglu.composeapplication.ui.screens

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.oguzavanoglu.composeapplication.ui.UserInputViewModel

@Composable
fun FunFactsNavigationGraph(userInputViewModel: UserInputViewModel = viewModel()){

    val navController = rememberNavController()

    NavHost(navController =navController , startDestination = Routes.USER_INPUT_SCREEN ) {

        composable(Routes.USER_INPUT_SCREEN) {

            UserInputScreen(userInputViewModel , showWelcomeScreen = {
                println("Coming_inside_showWelcomeScreen")
                println(it.first)
                println(it.second)
                navController.navigate(Routes.WELCOME_SCREEN+"/${it.first}/${it.second}")
            })
        }

        //Furkan a sor!
        //Change this route and to add arguments we need to add this as a complete route a string {{composable(Routes.WELCOME_SCREEN)}}
        //We can define these string as a constant inside our Route class --->  /{username}/{animalSelected}
        composable("${Routes.WELCOME_SCREEN}/{${Routes.USER_NAME}}/{${Routes.ANIMAL_SELECTED}}",
            arguments = listOf(

                navArgument(name = Routes.USER_NAME){type = NavType.StringType},
                navArgument(name = Routes.ANIMAL_SELECTED){type = NavType.StringType}
            )
            ) {

            val username = it?.arguments?.getString(Routes.USER_NAME)
            val animalSelected = it?.arguments?.getString(Routes.ANIMAL_SELECTED)

            WelcomeScreen(username,animalSelected)

        }
    }

}