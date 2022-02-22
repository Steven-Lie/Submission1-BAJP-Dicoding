package com.dicoding.moviecatalogue.ui.movie

import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class MovieViewModelTest {
    private lateinit var viewModel: MovieViewModel

    @Before
    fun setup() {
        viewModel = MovieViewModel()
    }

    @Test
    fun getMovies() {
        val catalogueEntities = viewModel.getMovies()
        assertNotNull(catalogueEntities)
        assertEquals(10, catalogueEntities.size)
    }
}