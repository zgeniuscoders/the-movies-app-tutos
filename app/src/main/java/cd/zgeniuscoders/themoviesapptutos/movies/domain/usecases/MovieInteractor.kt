package cd.zgeniuscoders.themoviesapptutos.movies.domain.usecases

import cd.zgeniuscoders.themoviesapptutos.movies.domain.services.MovieService

class MovieInteractor(
    val getMovies: GetMovies,
    val getMovie: GetMovie
) {

    companion object{
        fun build(service: MovieService): MovieInteractor{
            return MovieInteractor(
                GetMovies(service),
                GetMovie(service)
            )
        }
    }

}