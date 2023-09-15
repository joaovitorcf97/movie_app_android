package com.joao.movieapp.features.movie_popular.domain.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.joao.movieapp.core.domain.model.Movie
import com.joao.movieapp.features.movie_popular.domain.source.MoviePopularRemoteDataSource
import kotlinx.coroutines.flow.Flow

class MoviePopularRepositoryImp(
    private val remoteDataSource: MoviePopularRemoteDataSource
): MoviePopularRepository {

    override fun getPopularMovies(pagingConfig: PagingConfig): Flow<PagingData<Movie>> {
        return Pager(
            config = pagingConfig,
            pagingSourceFactory = {
                remoteDataSource.getPopularMoviesPagingSource()
            }
        ).flow
    }
}