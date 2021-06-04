package com.hfad.capstone1_made.di

import com.hfad.capstone1_made.core.domain.usecase.MovieInteractor
import com.hfad.capstone1_made.core.domain.usecase.MovieUseCase
import com.hfad.capstone1_made.detail.DetailMovieViewModel
import com.hfad.capstone1_made.home.HomeViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module


val useCaseModule = module {
    factory<MovieUseCase> { MovieInteractor(get()) }
}

val viewModelModule = module {
    viewModel { HomeViewModel(get()) }
    viewModel { DetailMovieViewModel(get()) }
}