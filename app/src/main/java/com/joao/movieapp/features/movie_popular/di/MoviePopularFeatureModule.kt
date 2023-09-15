package com.joao.movieapp.features.movie_popular.di

import com.joao.movieapp.core.data.remote.MovieService
import com.joao.movieapp.features.movie_popular.domain.repository.MoviePopularRepository
import com.joao.movieapp.features.movie_popular.domain.repository.MoviePopularRepositoryImp
import com.joao.movieapp.features.movie_popular.domain.source.MoviePopularRemoteDataSource
import com.joao.movieapp.features.movie_popular.domain.source.MoviePopularRemoteDataSourceImp
import com.joao.movieapp.features.movie_popular.domain.usecase.GetPopularMoviesUseCase
import com.joao.movieapp.features.movie_popular.domain.usecase.GetPopularMoviesUseCaseImp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class MoviePopularFeatureModule {

    @Provides
    @Singleton
    fun provideMovieDataSource(service: MovieService): MoviePopularRemoteDataSource {
        return MoviePopularRemoteDataSourceImp(service = service)
    }

    @Provides
    @Singleton
    fun provideMovieRepository(remoteDataSource: MoviePopularRemoteDataSource): MoviePopularRepository {
        return MoviePopularRepositoryImp(remoteDataSource = remoteDataSource)
    }

    @Provides
    @Singleton
    fun provideGetMoviesPopularUseCase(moviePopularRepository: MoviePopularRepository): GetPopularMoviesUseCase {
        return GetPopularMoviesUseCaseImp(repository = moviePopularRepository)
    }
}