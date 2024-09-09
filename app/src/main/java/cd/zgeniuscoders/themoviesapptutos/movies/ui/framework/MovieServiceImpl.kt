package cd.zgeniuscoders.themoviesapptutos.movies.ui.framework

import cd.zgeniuscoders.themoviesapptutos.movies.domain.models.Movie
import cd.zgeniuscoders.themoviesapptutos.movies.domain.services.MovieService

class MovieServiceImpl : MovieService {
    override suspend fun getMovie(id: String): Movie {
        TODO("Not yet implemented")
    }

    override suspend fun getMovies(): List<Movie> {
        return FakeMovieDB.getMovies()
    }
}