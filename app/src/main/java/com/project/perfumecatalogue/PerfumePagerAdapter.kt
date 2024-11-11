package com.project.perfumecatalogue

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Adapter for the ViewPager in the MainActivity
class PerfumePagerAdapter(private val perfumes: List<Perfume>) : RecyclerView.Adapter<PerfumePagerAdapter.PerfumeViewHolder>() {

    class PerfumeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.perfumeImage)
        val descriptionView: TextView = itemView.findViewById(R.id.perfumeDescription)
        val nameView: TextView = itemView.findViewById(R.id.perfumeName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PerfumeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_perfume_pager, parent, false)
        return PerfumeViewHolder(view)
    }

    override fun onBindViewHolder(holder: PerfumeViewHolder, position: Int) {
        val perfume = perfumes[position]
        holder.imageView.setImageResource(perfume.imageResId)
        holder.descriptionView.text = perfume.description
        holder.nameView.text = perfume.name
    }

    override fun getItemCount(): Int = perfumes.size
}
