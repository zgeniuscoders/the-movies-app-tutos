package cd.zgeniuscoders.themoviesapptutos.movies.domain.usecases

import cd.zgeniuscoders.themoviesapptutos.movies.domain.services.CategoryService
import cd.zgeniuscoders.themoviesapptutos.movies.domain.services.MovieService

class CategoryInteractor(
    val getCateogies: GetCategories,
) {

    companion object{
        fun build(service: CategoryService): CategoryInteractor{
            return CategoryInteractor(
                GetCategories(service),
            )
        }
    }

}