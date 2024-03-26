package com.example.woof.data

import android.hardware.biometrics.BiometricManager.Strings
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.woof.R

data class Photo(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val email: String,
    val tel: String,
    val address : String,
    val gen : String,
    val id : String,
    @StringRes val hobbies: Int
)

val dogs = listOf(

    Photo(R.drawable.photo1, R.string.P1,"Uria@exam.com","0817898908","Address1 Root33 Burapha Sakaeo 27160","13","60410001",R.string.P1_Des),
    Photo(R.drawable.photo2, R.string.P2,"Einstein@exam.com","0909878979","Address1 Root33 Burapha Sakaeo 27160","13","60410002",R.string.P2_Des),
    Photo(R.drawable.photo3, R.string.P3,"Behrensmeyer@exam.com","0607675798","Address1 Root33 Burapha Sakaeo 27160","13","60410003",R.string.P3_Des),
    Photo(R.drawable.photo4, R.string.P4, "Pascal@exam.com","0303927398","Address1 Root33 Burapha Sakaeo 27160","13","60410004",R.string.P4_Des),
    Photo(R.drawable.photo5, R.string.P5, "Herschel@exam.com","0603242534", "Address1 Root33 Burapha Sakaeo 27160","13","60410005",R.string.P5_Des),
    Photo(R.drawable.photo6, R.string.P6, "@exam.com","0809808433","Address1 Root33 Burapha Sakaeo 27160","13","60410006", R.string.P6_Des),
    Photo(R.drawable.photo7, R.string.P7, "Wu@exam.com","0902673492","Address1 Root33 Burapha Sakaeo 27160","13","60410007", R.string.P7_Des),
    Photo(R.drawable.photo8, R.string.P8, "Hodgkin@exam.com ","0706772324","Address1 Root33 Burapha Sakaeo 27160","13","60410008", R.string.P8_Des),
    Photo(R.drawable.photo9, R.string.P9, "Halley@exam.com","0509803242","Address1 Root33 Burapha Sakaeo 27160","13","60410009", R.string.P9_Des),
            Photo(R.drawable.photo10, R.string.P10, "Hubble@exam.com","0902347679","Address1 Root33 Burapha Sakaeo 27160","13","60410010", R.string.P10_Des)
)

