package cd.zgeniuscoders.themoviesapptutos.movies.ui.home

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import cd.zgeniuscoders.themoviesapptutos.movies.domain.services.CategoryService
import cd.zgeniuscoders.themoviesapptutos.movies.domain.services.MovieService

class HomeViewModel(
    private val movieService: MovieService,
    private val categoryService: CategoryService
): ViewModel() {

    var state by mutableStateOf(HomeState())

    suspend fun getMovies(){
        state = state.copy(movies = movieService.getMovies())
    }
    suspend fun getCategories(){
        state = state.copy(categories = categoryService.getCategories())
    }

}