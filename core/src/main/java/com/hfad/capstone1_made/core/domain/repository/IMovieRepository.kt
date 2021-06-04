package com.hfad.capstone1_made.core.domain.repository

import com.hfad.capstone1_made.core.data.source.Resource
import com.hfad.capstone1_made.core.domain.model.Movie
import kotlinx.coroutines.flow.Flow

interface IMovieRepository {
    fun getAllMovie(): Flow<Resource<List<Movie>>>

    fun getFavoriteMovie(): Flow<List<Movie>>

    fun setFavoriteMovie(movie: Movie, state: Boolean)

}