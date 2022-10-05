package ru.mmnigmatullov.notesappmvvm.navigation

import androidx.compose.foundation.interaction.DragInteraction
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ru.mmnigmatullov.notesappmvvm.screens.Add
import ru.mmnigmatullov.notesappmvvm.screens.Main
import ru.mmnigmatullov.notesappmvvm.screens.Note
import ru.mmnigmatullov.notesappmvvm.screens.Start

sealed class NavRoute(val route: String) {
    object Start: NavRoute ("start_screen")
    object Main: NavRoute ("main_screen")
    object Add: NavRoute ("add_screen")
    object Note: NavRoute ("note_screen")
}

@Composable
fun NotesNavHost() {
    val navController = rememberNavController()
    
    NavHost(navController = navController, startDestination = NavRoute.Start.route){
        composable(NavRoute.Start.route){ Start(navController = navController) }
        composable(NavRoute.Main.route){ Main(navController = navController) }
        composable(NavRoute.Add.route){ Add(navController = navController) }
        composable(NavRoute.Note.route){ Note(navController = navController) }
    }
}
