package com.remreren.hover

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Sample1Recyclerview : RecyclerView.Adapter<BaseViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_sample_1, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return 15
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.bind(position)
    }

    inner class ItemViewHolder(itemView: View) : BaseViewHolder(itemView) {

        lateinit var bg: View
        lateinit var tv: TextView

        override fun bind(position: Int) {
            bg.setBackgroundColor(Color.parseColor(if (position % 2 == 1) "#6d6d6d" else "#2c2c2c"))
            tv.text = "Item ${position + 1}"
        }
    }
}