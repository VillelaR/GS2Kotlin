package br.com.github.villelar.gskotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.github.villelar.gskotlin.screens.EquipeScreen
import br.com.github.villelar.gskotlin.screens.IMCScreen
import br.com.github.villelar.gskotlin.screens.LoginScreen
import br.com.github.villelar.gskotlin.screens.MenuScreen
import br.com.github.villelar.gskotlin.ui.theme.GskotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GskotlinTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = "login",
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        composable(route = "login") {
                            LoginScreen(
                                modifier = Modifier.fillMaxSize(),
                                navController = navController
                            )
                        }
                        composable(route = "menu") {
                            MenuScreen(
                                modifier = Modifier.fillMaxSize(),
                                navController = navController
                            )
                        }
                        composable(route = "imc") {
                            IMCScreen(
                                modifier = Modifier.fillMaxSize(),
                                navController = navController
                            )
                        }
                        composable(route = "equipe") {
                            EquipeScreen(
                                modifier = Modifier.fillMaxSize(),
                                navController = navController
                            )
                        }
                    }
                }
            }
        }
    }
}