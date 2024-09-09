package cd.zgeniuscoders.themoviesapptutos.movies.domain.services

import cd.zgeniuscoders.themoviesapptutos.movies.domain.models.Movie

interface MovieService {

    suspend fun getMovie(id: String): Movie

    suspend fun getMovies(): List<Movie>

}