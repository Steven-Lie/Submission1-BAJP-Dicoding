package com.dicoding.moviecatalogue.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.dicoding.moviecatalogue.R
import com.dicoding.moviecatalogue.data.CatalogueEntity
import com.dicoding.moviecatalogue.databinding.ActivityDetailBinding
import com.dicoding.moviecatalogue.databinding.DetailContentBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var detailContentBinding: DetailContentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityDetailBinding = ActivityDetailBinding.inflate(layoutInflater)
        detailContentBinding = activityDetailBinding.detailContent
        setContentView(activityDetailBinding.root)

        supportActionBar?.title = getString(R.string.detail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val viewModel = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        )[DetailViewModel::class.java]
        val extras = intent.extras
        if (extras != null) {
            val id = extras.getInt(EXTRA_ID)
            val type = extras.getString(EXTRA_TYPE)
            if (type != null) {
                viewModel.setSelectedItem(id, type)
                populateDetail(viewModel.getDetail())
            }
        }
    }

    private fun populateDetail(catalogueEntity: CatalogueEntity) {
        with(detailContentBinding) {
            tvTitle.text = catalogueEntity.title
            tvRelease.text = catalogueEntity.releaseDate
            tvDuration.text = catalogueEntity.duration
            tvGenre.text = catalogueEntity.genre
            tvOverview.text = catalogueEntity.overview
        }

        Glide.with(this)
            .load(catalogueEntity.poster)
            .into(detailContentBinding.imgPoster)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }

    companion object {
        const val EXTRA_ID = "id"
        const val EXTRA_TYPE = "type"
    }
}