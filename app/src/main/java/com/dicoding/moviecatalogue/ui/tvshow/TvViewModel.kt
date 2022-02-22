package com.dicoding.moviecatalogue.ui.tvshow

import androidx.lifecycle.ViewModel
import com.dicoding.moviecatalogue.data.CatalogueEntity
import com.dicoding.moviecatalogue.utils.DataDummy

class TvViewModel : ViewModel() {
    fun getTvs(): List<CatalogueEntity> = DataDummy.generateTvShow()
}