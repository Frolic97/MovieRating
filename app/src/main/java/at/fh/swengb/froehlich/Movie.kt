package at.fh.swengb.froehlich

class Movie(
    val id: String,
    val title: String,
    val release: String,
    val director: Person,
    val genre: MovieGenre,
    var actors: List<Person>,
    val reviews: MutableList<Review>,
    val plot: String
) {

    fun reviewAverage(): Double {
        return reviews
            .map{review -> review.reviewValue}
            .average()
            .run { if(isNaN()) 0.0 else this }
    }
}
