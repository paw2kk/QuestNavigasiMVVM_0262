package com.example.questnavigasimvvm_0262

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.questnavigasimvvm_0262.view.FormIsian
import com.example.questnavigasimvvm_0262.view.TampilData

enum class Navigasi{
    FormulirSaya,
    Detail
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController(),
    navigate: NavHostController.(String) -> Unit
) {
    Scaffold { isiRuang ->
        NavHost(
            navController = navController,
            startDestination = Navigasi.FormulirSaya.name,

            modifier = Modifier.padding(isiRuang)
        ) {
            composable(route = Navigasi.FormulirSaya.name) {
                FormIsian(
                    OnSubmitBtnClick = {
                        navController.navigate(Navigasi.Detail.name)
                    }
                )
            }
            composable(route = Navigasi.Detail.name) {
                TampilData(
                    onBackBtnClick = {
                        cancelAndBackToFormulirSaya(navController)
                    }
                )
            }
        }
    }
}
private fun cancelAndBackToFormulirSaya(
    navController: NavHostController
) {
    navController.popBackStack(Navigasi.FormulirSaya.name, inclusive = false)
}