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
import com.arcapp.moviesapp.databinding.FragmentMovieDetailBinding
import com.bumptech.glide.Glide

/*

 On this page, we have shown the movie details transmitted via bundle.

*/

class MovieDetailFragment : Fragment() {

    // using view binding
    private lateinit var bnd:FragmentMovieDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        // view binding inflate design
        bnd = FragmentMovieDetailBinding.inflate(layoutInflater, container, false)
        return bnd.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {

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
                    .into(bnd.ivMoviePoster)

                // Access the objects with view binding
                bnd.tvMovieName.text = movie.name
                bnd.tvMovieYear.text = movie.year.toString()
                bnd.rbImdb.rating = movie.imdb
                bnd.tvImdbPoint.text = movie.imdb.toString()
                bnd.tvDescription.text = movie.description

            }
        }

    }


}