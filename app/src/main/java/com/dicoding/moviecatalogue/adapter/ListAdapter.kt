package com.dicoding.moviecatalogue.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dicoding.moviecatalogue.data.CatalogueEntity
import com.dicoding.moviecatalogue.databinding.ItemListBinding
import com.dicoding.moviecatalogue.ui.detail.DetailActivity

class ListAdapter(private val type: String) : RecyclerView.Adapter<ListAdapter.ListViewHolder>() {
    private var listCatalogues = ArrayList<CatalogueEntity>()

    fun setCatalogues(catalogues: List<CatalogueEntity>?) {
        if (catalogues == null) return this.listCatalogues.clear()
        this.listCatalogues.addAll(catalogues)
    }

    class ListViewHolder(private val binding: ItemListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(catalogue: CatalogueEntity, type: String) {
            with(binding) {
                tvTitle.text = catalogue.title
                tvRelease.text = catalogue.releaseDate
                tvOverview.text = catalogue.overview
                Glide.with(itemView.context)
                    .load(catalogue.poster)
                    .into(imgPoster)

                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailActivity::class.java)
                    intent.putExtra(DetailActivity.EXTRA_ID, catalogue.id)
                    intent.putExtra(DetailActivity.EXTRA_TYPE, type)
                    itemView.context.startActivity(intent)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val itemListBinding =
            ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListViewHolder(itemListBinding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val catalogue = listCatalogues[position]
        holder.bind(catalogue, type)
    }

    override fun getItemCount(): Int = listCatalogues.size
}