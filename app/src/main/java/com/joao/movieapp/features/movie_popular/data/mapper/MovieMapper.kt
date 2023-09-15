package com.joao.movieapp.features.movie_popular.data.mapper

import com.joao.movieapp.core.data.remote.model.MovieResult
import com.joao.movieapp.core.domain.model.Movie
import com.joao.movieapp.core.util.toPostUrl

fun List<MovieResult>.toMovie() = map { movieResult ->
    Movie(
        id = movieResult.id,
        title = movieResult.title,
        voteAverage = movieResult.voteAverage,
        imageUrl = movieResult.posterPath.toPostUrl() ?: ""
    )
}