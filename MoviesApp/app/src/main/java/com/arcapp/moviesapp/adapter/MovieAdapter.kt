package com.arcapp.moviesapp.fragment

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.arcapp.moviesapp.R
import com.arcapp.moviesapp.data.MovieModel
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestListener

class MovieAdapter(
    private val context:Context,
    private val movieList: MutableList<MovieModel>,
    private val listener: MovieListener
    ) :
    RecyclerView.Adapter<MovieAdapter.MoviesViewHolder>() {

    // connect the design
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movie_list, parent, false)
        return MoviesViewHolder(view)
    }

    // connect the objects on the design
    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        holder.bind(context, movieList[position], listener)
    }

    class MoviesViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val ivMoviePoster = view.findViewById<ImageView>(R.id.ivMoviePoster)
        private val tvMovieName = view.findViewById<TextView>(R.id.tvMovieName)
        private val tvMovieYear = view.findViewById<TextView>(R.id.tvMovieYear)

        fun bind(context: Context, movie: MovieModel, listener: MovieListener) {

            // add data
            tvMovieName.text = movie.name
            tvMovieYear.text = movie.year.toString()

            // load image with glide library
            Glide.with(context)
                .load(movie.image)
                .centerCrop()
                .into(ivMoviePoster)

            // on click the items, we transfer them to the listener
            itemView.setOnClickListener {
                listener.onClicked(movie)
            }

        }
    }

    // for adapter set all item size
    override fun getItemCount(): Int {
        return movieList.size
    }

}

// listener that sends data to our main class on click actions
interface MovieListener {
    fun onClicked(movie: MovieModel)
}