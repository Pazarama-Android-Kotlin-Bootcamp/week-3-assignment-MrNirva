package com.arcapp.moviesapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.arcapp.moviesapp.R
import com.arcapp.moviesapp.data.MovieModel
import com.bumptech.glide.Glide

/*

 On this page, we have shown the movie details transmitted via bundle.

*/

class MovieDetailFragment : Fragment() {

    private lateinit var ivMoviePoster:ImageView
    private lateinit var tvMovieName:TextView
    private lateinit var tvMovieYear:TextView
    private lateinit var rbImdb:RatingBar
    private lateinit var tvImdbPoint:TextView
    private lateinit var tvDescription:TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_movie_detail, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViews(view)
    }

    private fun setupViews(view: View) {

        ivMoviePoster = view.findViewById(R.id.ivMoviePoster)
        tvMovieName = view.findViewById(R.id.tvMovieName)
        tvMovieYear = view.findViewById(R.id.tvMovieYear)
        rbImdb = view.findViewById(R.id.rbImdb)
        tvImdbPoint = view.findViewById(R.id.tvImdbPoint)
        tvDescription = view.findViewById(R.id.tvDescription)

        // null state check of data
        arguments?.let {

            val movieData = it.getString("movieModel")

            // null state check of data
            movieData?.let { safeMovieData ->

                val movie = MovieModel.fromJson(safeMovieData)

                // we uploaded image via url with glide library
                Glide.with(requireContext())
                    .load(movie.image)
                    .centerCrop()
                    .into(ivMoviePoster)

                tvMovieName.text = movie.name
                tvMovieYear.text = movie.year.toString()
                rbImdb.rating = movie.imdb
                tvImdbPoint.text = movie.imdb.toString()
                tvDescription.text = movie.description

            }
        }

    }


}