package com.dicoding.moviecatalogue.ui.movie

import androidx.lifecycle.ViewModel
import com.dicoding.moviecatalogue.data.CatalogueEntity
import com.dicoding.moviecatalogue.utils.DataDummy

class MovieViewModel : ViewModel() {
    fun getMovies(): List<CatalogueEntity> = DataDummy.generateMovie()
}