package com.example.sahibinden

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.sahibinden.databinding.ItemVcBinding

class MainAdapter
    (private val items: List<Item>,val mContext:Context) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: ItemVcBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(item: Item){
            binding.searchMagIcon.setImageResource(item.pictures)
            binding.textTop.text = item.title
            binding.textBottom.text = item.bottomTitle
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: ItemVcBinding = DataBindingUtil.inflate(
            LayoutInflater.from(mContext),
            R.layout.item_vc,
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }


}