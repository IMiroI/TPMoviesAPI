package com.givaudan.movie.presentation.search

import com.givaudan.movie.domain.model.MovieShort

sealed class SearchState {

    class SuccessState(val movies:List<MovieShort>) : SearchState()

    object ErrorState : SearchState()

    object LoadingState : SearchState()

}