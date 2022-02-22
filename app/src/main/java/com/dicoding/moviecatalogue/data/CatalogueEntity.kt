package com.dicoding.moviecatalogue.data

data class CatalogueEntity(
    var id: Int? = 0,
    var title: String? = null,
    var releaseDate: String? = null,
    var genre: String? = null,
    var duration: String? = null,
    var overview: String? = null,
    var poster: Int? = 0,
)