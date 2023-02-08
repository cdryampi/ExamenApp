package com.ircarren.examenapp.provider

import com.ircarren.examenapp.R
import com.ircarren.examenapp.model.Mitologia

class MitologiaProvider {
    companion object{
        val mitologias = listOf<Mitologia>(
            Mitologia("griega", R.drawable.mitologia_griega, ""),
            Mitologia("romana", R.drawable.mitologia_romana, ""),
            Mitologia("nordica", R.drawable.mitologia_nordica, ""),
            Mitologia("egipcia", R.drawable.egipcios, ""),
            Mitologia("celta", R.drawable.mitologia_celta, ""),
            Mitologia("india", R.drawable.mitologia_india, ""),
            Mitologia("china", R.drawable.mitologia_china, ""),
            Mitologia("japonesa", R.drawable.mitologia_japonesa, ""),
            Mitologia("mayas", R.drawable.mitologia_mayas, ""),
            Mitologia("azteca", R.drawable.mitologia_azteca, ""),
        )
    }
}