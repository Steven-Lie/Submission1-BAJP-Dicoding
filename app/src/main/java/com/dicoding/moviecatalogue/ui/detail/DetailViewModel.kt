package com.dicoding.moviecatalogue.ui.detail

import androidx.lifecycle.ViewModel
import com.dicoding.moviecatalogue.data.CatalogueEntity
import com.dicoding.moviecatalogue.utils.DataDummy

class DetailViewModel : ViewModel() {
    private var id: Int = 0
    private lateinit var type: String

    fun setSelectedItem(id: Int, type: String) {
        this.id = id
        this.type = type
    }

    fun getDetail(): CatalogueEntity {
        lateinit var catalogue: CatalogueEntity
        lateinit var catalogueEntities: List<CatalogueEntity>
        when (type) {
            "movie" -> catalogueEntities = DataDummy.generateMovie()
            "tv" -> catalogueEntities = DataDummy.generateTvShow()
        }
        for (catalogueEntity in catalogueEntities) {
            if (catalogueEntity.id == id) {
                catalogue = catalogueEntity
            }
        }
        return catalogue
    }
}