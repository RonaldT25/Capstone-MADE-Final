package com.hfad.capstone1_made.core.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Movie(
    var movieId: String,
    var title: String,
    var overview: String,
    var backImage: String,
    var vote: String,
    var poster: String,
    var isFavorite: Boolean
) : Parcelable