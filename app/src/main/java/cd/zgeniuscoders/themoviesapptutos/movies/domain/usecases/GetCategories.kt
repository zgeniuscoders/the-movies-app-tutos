package cd.zgeniuscoders.themoviesapptutos.movies.domain.usecases

import cd.zgeniuscoders.themoviesapptutos.movies.domain.models.Category
import cd.zgeniuscoders.themoviesapptutos.movies.domain.models.Movie
import cd.zgeniuscoders.themoviesapptutos.movies.domain.services.CategoryService
import cd.zgeniuscoders.themoviesapptutos.movies.domain.services.MovieService

class GetCategories(
    private val service: CategoryService
) {

    suspend fun run(): List<Category>{
        return service.getCategories()
    }
}