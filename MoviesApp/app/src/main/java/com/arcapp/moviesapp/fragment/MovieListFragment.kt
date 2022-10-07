package com.arcapp.moviesapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.arcapp.moviesapp.R
import com.arcapp.moviesapp.data.MovieModel
import com.arcapp.moviesapp.data.mockMovieData

/*

 On this page, we showed the movie list on RecyclerView with our design.

*/

class MovieListFragment : Fragment(), MovieListener {

    private lateinit var rvMovieList: RecyclerView
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_movie_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = findNavController()
        rvMovieList = view.findViewById(R.id.rvMovieList)
        setupAdapter()
    }

    private fun setupAdapter() {

        rvMovieList.adapter = MovieAdapter(requireContext(), mockMovieData, this@MovieListFragment)

        // We shot 2 movies per line with StaggeredGridLayoutManager
        rvMovieList.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

    }

    // When we clicked on the items, we were directed to the detail page with the data.
    override fun onClicked(movie: MovieModel) {
        navController.navigate(R.id.action_movieListFragment_to_movieDetailFragment, Bundle().apply {
            putString("movieModel", movie.toJson())
        })
    }

}