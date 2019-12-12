package at.fh.swengb.froehlich

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ExpandableListView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_movie.view.*

class MovieAdapter(val clickListener: (movie: Movie) -> Unit): RecyclerView.Adapter<MovieViewHolder>() {

    private var movieList = listOf<Movie>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val movieItemView = inflater.inflate(R.layout.item_movie, parent, false)
        return MovieViewHolder(movieItemView, clickListener)
    }

    override fun getItemCount(): Int = movieList.count()

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) =
        holder.bindItem(movieList[position])

    fun updateList(newList: List<Movie>) {
        movieList = newList
        notifyDataSetChanged()
    }
}

class MovieViewHolder(itemView: View, val clickListener: (movie: Movie) -> Unit): RecyclerView.ViewHolder(itemView) {
    fun bindItem(movie: Movie) {
        with(itemView){
            item_movie_title.text = movie.title
            item_movie_release.text = movie.release
            item_movie_actors.text = movie.actors.joinToString(", ") { it.name }
            item_movie_director.text = movie.director.name
            item_movie_avg_review_bar.rating = movie.reviewAverage().toFloat()
            item_movie_avg_review_value.text = movie.reviewAverage().toString()
            item_movie_review_count.text = movie.reviews.count().toString()
        }

        itemView.setOnClickListener{
            clickListener(movie)
        }
    }
}