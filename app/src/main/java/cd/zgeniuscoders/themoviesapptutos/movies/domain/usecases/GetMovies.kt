package cd.zgeniuscoders.themoviesapptutos.movies.domain.usecases

import cd.zgeniuscoders.themoviesapptutos.movies.domain.models.Movie
import cd.zgeniuscoders.themoviesapptutos.movies.domain.services.MovieService

class GetMovies(
    private val service: MovieService
) {

    suspend fun run(): List<Movie>{
        return service.getMovies()
    }
}