package at.fh.swengb.froehlich

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        val EXTRA_MOVIE_ID = "MOVIE_ID_EXTRA"
        val VIEW_DETAIL_OR_ADD_REVIEW_REQUEST = 1
        //val EXTRA_REVIEW_ADDED = "REVIEW_ADDED_EXTRA"
    }

    val movieAdapter = MovieAdapter {
        val intent = Intent(this, MovieDetailActivity::class.java)
        intent.putExtra(EXTRA_MOVIE_ID, it.id)
        startActivityForResult(intent, VIEW_DETAIL_OR_ADD_REVIEW_REQUEST)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        movieAdapter.updateList(MovieRepository.movieList())
        movie_recycler_view.layoutManager = LinearLayoutManager(this)
        movie_recycler_view.adapter = movieAdapter

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == VIEW_DETAIL_OR_ADD_REVIEW_REQUEST && resultCode == Activity.RESULT_OK){
            movieAdapter.updateList(MovieRepository.movieList())
        }
    }
}
