package at.fh.swengb.froehlich

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_movie_detail.*

class MovieDetailActivity : AppCompatActivity() {

    companion object{
        val EXTRA_MOVIE_ID = "MOVIE_ID_EXTRA"
        val ADD_RATING_REQUEST = 1
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        val movieId: String? = intent.getStringExtra(MainActivity.EXTRA_MOVIE_ID)
        val movie = MovieRepository.movieById(movieId)
        if(movie == null){
            Toast.makeText(this, "Movie does not exist", Toast.LENGTH_LONG).show()
            finish()
        }
        else {
            with(movie) {
                movie_detail_header.text = title
                movie_detail_director.text = director.name
                movie_detail_actors.text = actors.joinToString(", ") { it.name }
                movie_detail_genre.text = genre.description
                movie_detail_avg_review_bar.rating = reviewAverage().toFloat()
                movie_detail_avg_review_value.text = reviewAverage().toString()
                movie_detail_review_count.text = reviews.count().toString()
                movie_detail_release.text = release
                movie_detail_plot.text = plot
            }

            open_review.setOnClickListener {
                val ratingIntent = Intent(this, MovieReviewActivity::class.java)
                ratingIntent.putExtra(EXTRA_MOVIE_ID, movieId)
                    // movieId not smart cast to string, but never null in this else block
                startActivityForResult(ratingIntent, ADD_RATING_REQUEST)
            }
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == ADD_RATING_REQUEST && resultCode == Activity.RESULT_OK){
            val resultIntent = Intent()
            //resultIntent.putExtra(MainActivity.EXTRA_REVIEW_ADDED,true)
            setResult(Activity.RESULT_OK, resultIntent)
            finish()
        }
    }
}
