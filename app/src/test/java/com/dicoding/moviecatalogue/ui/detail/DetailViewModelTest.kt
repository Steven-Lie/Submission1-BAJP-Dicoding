package com.dicoding.moviecatalogue.ui.detail

import com.dicoding.moviecatalogue.utils.DataDummy
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class DetailViewModelTest {
    private lateinit var viewModel: DetailViewModel
    private val dummyMovies = DataDummy.generateMovie()[0]
    private val dummyTv = DataDummy.generateTvShow()[0]
    private val movieType = "movie"
    private val tvType = "tv"

    @Before
    fun setup() {
        viewModel = DetailViewModel()
    }

    @Test
    fun getDetailMovie() {
        dummyMovies.id?.let { viewModel.setSelectedItem(it, movieType) }
        val movie = viewModel.getDetail()
        assertNotNull(movie)
        assertEquals(dummyMovies.id, movie.id)
        assertEquals(dummyMovies.poster, movie.poster)
        assertEquals(dummyMovies.title, movie.title)
        assertEquals(dummyMovies.releaseDate, movie.releaseDate)
        assertEquals(dummyMovies.duration, movie.duration)
        assertEquals(dummyMovies.genre, movie.genre)
        assertEquals(dummyMovies.overview, movie.overview)
    }

    @Test
    fun getDetailTv() {
        dummyTv.id?.let { viewModel.setSelectedItem(it, tvType) }
        val tv = viewModel.getDetail()
        assertNotNull(tv)
        assertEquals(dummyTv.id, tv.id)
        assertEquals(dummyTv.poster, tv.poster)
        assertEquals(dummyTv.title, tv.title)
        assertEquals(dummyTv.releaseDate, tv.releaseDate)
        assertEquals(dummyTv.duration, tv.duration)
        assertEquals(dummyTv.genre, tv.genre)
        assertEquals(dummyTv.overview, tv.overview)
    }
}