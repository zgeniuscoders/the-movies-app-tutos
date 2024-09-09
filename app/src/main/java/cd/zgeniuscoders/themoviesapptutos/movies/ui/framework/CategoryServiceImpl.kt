package cd.zgeniuscoders.themoviesapptutos.movies.ui.framework

import cd.zgeniuscoders.themoviesapptutos.movies.domain.models.Category
import cd.zgeniuscoders.themoviesapptutos.movies.domain.models.Movie
import cd.zgeniuscoders.themoviesapptutos.movies.domain.services.CategoryService

class CategoryServiceImpl : CategoryService {
    override suspend fun getCategory(id: String): Category {
        TODO("Not yet implemented")
    }

    override suspend fun getCategories(): List<Category> {
        return FakeCategoryDB.getCategories()
    }
}