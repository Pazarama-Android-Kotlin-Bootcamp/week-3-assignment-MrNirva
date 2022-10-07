package com.arcapp.moviesapp.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Artist(
    val name:String,
    val image:String
) : Parcelable {



}