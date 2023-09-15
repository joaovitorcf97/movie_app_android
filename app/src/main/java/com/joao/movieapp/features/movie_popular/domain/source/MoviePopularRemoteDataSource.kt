package com.joao.movieapp.features.movie_popular.domain.source

import com.joao.movieapp.core.data.remote.response.MovieResponse
import com.joao.movieapp.core.paging.MoviePagingSource

interface MoviePopularRemoteDataSource {
    fun getPopularMoviesPagingSource(): MoviePagingSource
    suspend fun getPopularMovies(page: Int): MovieResponse
}