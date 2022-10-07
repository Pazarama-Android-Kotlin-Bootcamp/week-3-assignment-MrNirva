package com.arcapp.moviesapp.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

// This model for artist information

@Parcelize
data class ArtistModel(
    val name:String,
    val image:String
) : Parcelable