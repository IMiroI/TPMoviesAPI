package com.givaudan.movie.domain.repository

import com.givaudan.movie.domain.model.MovieShort

interface SearchRepository {

    suspend fun searchMovie(search : String) : List<MovieShort>

}