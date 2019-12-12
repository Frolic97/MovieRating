package at.fh.swengb.froehlich

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import at.fh.swengb.froehlich.MovieRepository.reviewMovie
import kotlinx.android.synthetic.main.activity_movie_review.*

class MovieReviewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_review)

        val movieId = intent.getStringExtra(MovieDetailActivity.EXTRA_MOVIE_ID)
        val movie = MovieRepository.movieById(movieId)
        if(movie == null){
            Toast.makeText(this, "Movie does not exist", Toast.LENGTH_LONG).show()
            finish()
        }
        else {
            movie_review_header.text = movie.title

            review_movie.setOnClickListener {
                val reviewVal = movie_review_bar.rating.toDouble()
                if(reviewVal > 0.0) {
                    val movieReview =
                        Review(reviewVal, movie_reviewText.text.toString())
                    reviewMovie(movieId, movieReview)

                    val resultIntent = Intent()
                    setResult(Activity.RESULT_OK, resultIntent)
                    finish()
                }
                else{
                    Toast.makeText(this, "Please be fair!", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}
