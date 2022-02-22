package com.dicoding.moviecatalogue.ui.tvshow

import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class TvViewModelTest {
    private lateinit var viewModel: TvViewModel

    @Before
    fun setup() {
        viewModel = TvViewModel()
    }

    @Test
    fun getTvs() {
        val catalogueEntities = viewModel.getTvs()
        assertNotNull(catalogueEntities)
        assertEquals(10, catalogueEntities.size)
    }
}