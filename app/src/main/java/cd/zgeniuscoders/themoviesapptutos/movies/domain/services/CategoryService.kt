package cd.zgeniuscoders.themoviesapptutos.movies.domain.services

import cd.zgeniuscoders.themoviesapptutos.movies.domain.models.Category
import cd.zgeniuscoders.themoviesapptutos.movies.domain.models.Movie

interface CategoryService {
    suspend fun getCategory(id: String): Category

    suspend fun getCategories(): List<Category>
}