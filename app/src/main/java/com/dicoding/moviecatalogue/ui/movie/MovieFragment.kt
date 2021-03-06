package com.dicoding.moviecatalogue.ui.movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.dicoding.moviecatalogue.adapter.ListAdapter
import com.dicoding.moviecatalogue.databinding.FragmentMovieBinding

class MovieFragment : Fragment() {
    private lateinit var fragmentMovieBinding: FragmentMovieBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentMovieBinding = FragmentMovieBinding.inflate(layoutInflater, container, false)
        return fragmentMovieBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            val viewModel = ViewModelProvider(
                this,
                ViewModelProvider.NewInstanceFactory()
            )[MovieViewModel::class.java]
            val movies = viewModel.getMovies()

            val listAdapter = ListAdapter(TYPE)
            listAdapter.setCatalogues(movies)

            with(fragmentMovieBinding.rvMovie) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = listAdapter
            }
        }
    }

    companion object {
        const val TYPE = "movie"
    }
}