package com.joao.movieapp.features.movie_popular.domain.usecase


import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.joao.movieapp.core.domain.model.Movie
import com.joao.movieapp.features.movie_popular.domain.repository.MoviePopularRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

interface GetPopularMoviesUseCase {
    operator fun invoke(): Flow<PagingData<Movie>>
}

class GetPopularMoviesUseCaseImp @Inject constructor (
    private val repository: MoviePopularRepository
) : GetPopularMoviesUseCase {
    override fun invoke(): Flow<PagingData<Movie>> {
        return repository.getPopularMovies(
            pagingConfig = PagingConfig(
                pageSize = 20,
                initialLoadSize = 20
            )
        )
    }

}