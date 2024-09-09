package cd.zgeniuscoders.themoviesapptutos.movies.ui.home

import cd.zgeniuscoders.themoviesapptutos.movies.domain.models.Category
import cd.zgeniuscoders.themoviesapptutos.movies.domain.models.Movie

data class HomeState(
    val isLoading: Boolean = true,
    val movies: List<Movie> = emptyList(),
    val categories: List<Category> = emptyList()
)