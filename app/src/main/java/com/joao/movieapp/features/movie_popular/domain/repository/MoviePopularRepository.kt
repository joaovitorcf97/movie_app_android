package com.joao.movieapp.features.movie_popular.domain.repository

import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.joao.movieapp.core.domain.model.Movie
import kotlinx.coroutines.flow.Flow

interface MoviePopularRepository {
    fun getPopularMovies(pagingConfig: PagingConfig): Flow<PagingData<Movie>>
}