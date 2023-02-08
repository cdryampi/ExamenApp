package com.ircarren.examenapp.provider

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import com.ircarren.examenapp.model.Icono

class IconProvider {
    companion object {
        val icons = listOf<Icono>(
            Icono(Icons.Filled.Home, "Home"),
            Icono(Icons.Filled.Favorite, "Favoritos"),
            Icono(Icons.Default.Add, "profile"),
        )
    }
}