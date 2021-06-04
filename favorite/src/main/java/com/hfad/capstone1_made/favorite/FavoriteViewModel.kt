package com.hfad.capstone1_made.favorite

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.hfad.capstone1_made.core.domain.usecase.MovieUseCase

class FavoriteViewModel(movieUseCase: MovieUseCase) : ViewModel() {
    val favoriteMovie = movieUseCase.getFavoriteMovie().asLiveData()
}