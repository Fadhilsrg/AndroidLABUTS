package com.example.utsandroidlab.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.utsandroidlab.DetailActivity
import com.example.utsandroidlab.R
import com.example.utsandroidlab.model.CardItem

class CardAdapter(private val cardItems: List<CardItem>) : RecyclerView.Adapter<CardAdapter.CardViewHolder>() {

    class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cardImage: ImageView = itemView.findViewById(R.id.card_image)
        val cardTitle: TextView = itemView.findViewById(R.id.card_title)
        val cardChart: ImageView = itemView.findViewById(R.id.card_chart)
        val cardContainer: View = itemView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_item, parent, false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val cardItem = cardItems[position]
        holder.cardImage.setImageResource(cardItem.imageResId)
        holder.cardTitle.text = cardItem.title
        holder.cardChart.setImageResource(cardItem.chartResId)

        holder.cardContainer.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, DetailActivity::class.java).apply {
                putExtra("title", cardItem.title)
                putExtra("image", cardItem.imageResId)
                putExtra("chart", cardItem.chartResId)
                putExtra("unit", cardItem.unit)
                putExtra("average", cardItem.averageValue)
                putExtra("lowest", cardItem.lowestValue)
                putExtra("highest", cardItem.highestValue)
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = cardItems.size
}