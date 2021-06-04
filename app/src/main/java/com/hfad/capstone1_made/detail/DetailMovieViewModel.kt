package com.hfad.capstone1_made.detail

import androidx.lifecycle.ViewModel
import com.hfad.capstone1_made.core.domain.model.Movie
import com.hfad.capstone1_made.core.domain.usecase.MovieUseCase

class DetailMovieViewModel(private val movieUseCase: MovieUseCase) : ViewModel() {
    fun setFavoriteMovie(movie: Movie, newStatus:Boolean) =
        movieUseCase.setFavoriteMovie(movie, newStatus)
}