package com.hfad.capstone1_made.core.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class MovieResponse(
    @field:SerializedName("id")
    val id: String,

    @field:SerializedName("title")
    val title: String,

    @field:SerializedName("overview")
    val overview: String,

    @field:SerializedName("vote_average")
    val vote: String,

    @field:SerializedName("backdrop_path")
    val backImage: String,

    @field:SerializedName("poster_path")
    val poster: String
)