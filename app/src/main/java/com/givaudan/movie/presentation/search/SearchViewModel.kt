package com.givaudan.movie.presentation.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.givaudan.movie.data.mock.MockSearchRepository
import com.givaudan.movie.domain.repository.SearchRepository
import kotlinx.coroutines.launch

class SearchViewModel : ViewModel() {

    private val repository : SearchRepository = MockSearchRepository()

    private val _state = MutableLiveData<SearchState>()
    val state : LiveData<SearchState> get() = _state

    fun searchMovie(text: String){
        _state.value = SearchState.LoadingState

        viewModelScope.launch {
            try {
                _state.value = SearchState.SuccessState(repository.searchMovie(text))
            } catch (e:Exception){
                _state.value = SearchState.ErrorState
            }

        }
    }

}