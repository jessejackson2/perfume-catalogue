package com.project.perfumecatalogue

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ThumbnailsAdapter(private val perfumes: List<Perfume>, private val onClick: (Int) -> Unit) : RecyclerView.Adapter<ThumbnailsAdapter.ThumbnailViewHolder>() {

    class ThumbnailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.thumbnailImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ThumbnailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_thumbnail, parent, false)
        return ThumbnailViewHolder(view)
    }

    override fun onBindViewHolder(holder: ThumbnailViewHolder, position: Int) {
        val perfume = perfumes[position]
        holder.imageView.setImageResource(perfume.imageResId)
        holder.imageView.setOnClickListener { onClick(position) }
    }

    override fun getItemCount(): Int = perfumes.size
}
