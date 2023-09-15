package com.joao.movieapp.features.movie_popular.domain.source

import com.joao.movieapp.core.data.remote.MovieService
import com.joao.movieapp.core.data.remote.response.MovieResponse
import com.joao.movieapp.core.paging.MoviePagingSource

class MoviePopularRemoteDataSourceImp constructor(
    private val service: MovieService
) : MoviePopularRemoteDataSource{
    override fun getPopularMoviesPagingSource(): MoviePagingSource {
        return MoviePagingSource(this)
    }

    override suspend fun getPopularMovies(page: Int): MovieResponse {
        return service.getPopularMovies(page = page)
    }
}