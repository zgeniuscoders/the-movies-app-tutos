package cd.zgeniuscoders.themoviesapptutos.movies.domain.usecases

import cd.zgeniuscoders.themoviesapptutos.movies.domain.models.Movie
import cd.zgeniuscoders.themoviesapptutos.movies.domain.services.MovieService

class GetMovie(
    private val service: MovieService
) {

    suspend fun run(id: String) : Movie{
        return service.getMovie(id)
    }


}