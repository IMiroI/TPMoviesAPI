package com.givaudan.movie.data.mock

import com.givaudan.movie.domain.model.MovieShort
import com.givaudan.movie.domain.repository.SearchRepository

class MockSearchRepository : SearchRepository {

    override suspend fun searchMovie(search: String): List<MovieShort> {
        return listOf(
            MovieShort("1","Titre 1","https://ateliersartmuseesnationaux.fr/Icono/Moulage/700x700/PB002024.jpg"),
            MovieShort("2","Titre 2","https://ateliersartmuseesnationaux.fr/Icono/Moulage/700x700/PB002024.jpg"),
            MovieShort("3","Titre 3","https://ateliersartmuseesnationaux.fr/Icono/Moulage/700x700/PB002024.jpg"),
            MovieShort("4","Titre 4","https://ateliersartmuseesnationaux.fr/Icono/Moulage/700x700/PB002024.jpg"),
            MovieShort("5","Titre 5","https://ateliersartmuseesnationaux.fr/Icono/Moulage/700x700/PB002024.jpg"),
            MovieShort("6","Titre 6","https://ateliersartmuseesnationaux.fr/Icono/Moulage/700x700/PB002024.jpg")
        )
    }

}