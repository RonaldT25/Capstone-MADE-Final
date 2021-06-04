package com.hfad.capstone1_made.core.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class ListMovieResponse(

    @field:SerializedName("results")
    val places: List<MovieResponse>
)