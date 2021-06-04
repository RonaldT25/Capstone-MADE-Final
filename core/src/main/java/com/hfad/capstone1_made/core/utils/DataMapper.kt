package com.hfad.capstone1_made.core.utils

import com.hfad.capstone1_made.core.data.source.local.entity.MovieEntity
import com.hfad.capstone1_made.core.data.source.remote.response.MovieResponse
import com.hfad.capstone1_made.core.domain.model.Movie


object DataMapper {
    fun mapResponsesToEntities(input: List<MovieResponse>): List<MovieEntity> {
        val movieList = ArrayList<MovieEntity>()
        input.map {
            val movie = MovieEntity(
                movieId = it.id,
                title = it.title,
                overview = it.overview,
                backImage = it.backImage,
                vote = it.vote,
                poster = it.poster,
                isFavorite = false
            )
            movieList.add(movie)
        }
        return movieList
    }

    fun mapEntitiesToDomain(input: List<MovieEntity>): List<Movie> =
        input.map {
            Movie(
                movieId = it.movieId,
                title = it.title,
                overview = it.overview,
                backImage = it.backImage,
                vote = it.vote,
                poster = it.poster,
                isFavorite = it.isFavorite
            )
        }

    fun mapDomainToEntity(input: Movie) = MovieEntity(
        movieId = input.movieId,
        title = input.title,
        overview = input.overview,
        backImage = input.backImage,
        vote = input.vote,
        poster = input.poster,
        isFavorite = input.isFavorite
    )
}