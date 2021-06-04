package com.hfad.capstone1_made.core.data.source.remote.network

import com.hfad.capstone1_made.core.data.source.remote.response.ListMovieResponse
import retrofit2.http.GET

interface ApiService {
    @GET("movie/popular?api_key=5a3cbf262b90e5c576a4b84fd3fcb308")
    suspend fun getList(): ListMovieResponse
}