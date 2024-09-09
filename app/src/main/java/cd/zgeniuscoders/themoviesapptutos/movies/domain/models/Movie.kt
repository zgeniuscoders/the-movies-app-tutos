package cd.zgeniuscoders.themoviesapptutos.movies.domain.models

data class Movie(
    val id: Int,
    val title: String,
    val synopsis: String,
    val releaseDate: String,
    val posterPath: Int,
    val overview: String,
    val category: String,
)
