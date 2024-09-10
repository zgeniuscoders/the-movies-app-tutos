package cd.zgeniuscoders.themoviesapptutos.movies.ui.home

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import cd.zgeniuscoders.themoviesapptutos.movies.domain.services.CategoryService
import cd.zgeniuscoders.themoviesapptutos.movies.domain.services.MovieService
import cd.zgeniuscoders.themoviesapptutos.movies.domain.usecases.CategoryInteractor
import cd.zgeniuscoders.themoviesapptutos.movies.domain.usecases.MovieInteractor

class HomeViewModel(
    private val movieInteractor: MovieInteractor,
    private val categoryInteractor: CategoryInteractor
): ViewModel() {

    var state by mutableStateOf(HomeState())

    suspend fun getMovies(){
        val movies = movieInteractor.getMovies.run()
        state = state.copy(movies = movies)
    }
    suspend fun getCategories(){
        val categories = categoryInteractor.getCateogies.run()
        state = state.copy(categories = categories)
    }

}