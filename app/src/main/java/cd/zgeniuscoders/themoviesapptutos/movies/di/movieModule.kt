package cd.zgeniuscoders.themoviesapptutos.movies.di


import cd.zgeniuscoders.themoviesapptutos.movies.domain.usecases.CategoryInteractor
import cd.zgeniuscoders.themoviesapptutos.movies.domain.usecases.MovieInteractor
import cd.zgeniuscoders.themoviesapptutos.movies.ui.framework.CategoryServiceImpl
import cd.zgeniuscoders.themoviesapptutos.movies.ui.framework.MovieServiceImpl
import cd.zgeniuscoders.themoviesapptutos.movies.ui.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val movieModule = module {

   single<CategoryInteractor> {
      val categoryService = CategoryServiceImpl()
      CategoryInteractor.build(categoryService)
   }

   single<MovieInteractor> {
      val movieService = MovieServiceImpl()
      MovieInteractor.build(movieService)
   }

   viewModel<HomeViewModel> {
      val movieInteractor = get<MovieInteractor>()
      val categoryInteractor = get<CategoryInteractor>()
      HomeViewModel(movieInteractor,categoryInteractor)
   }

}