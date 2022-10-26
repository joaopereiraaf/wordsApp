package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ItemListBinding

class ListAdapter(private val words: List<Words>)
    : RecyclerView.Adapter<ListAdapter.ViewHolder>() {

        private lateinit var binding: ItemListBinding

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            binding = ItemListBinding.inflate(inflater, parent, false)
            return ViewHolder(binding)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.bind(words[position])
        }

        override fun getItemCount() = words.size

        inner class ViewHolder(itemView : ItemListBinding) : RecyclerView.ViewHolder(itemView.root){
            fun bind(item : Words) {
                binding.apply {
                    word.text = item.word
                    wordCount.text = item.wordCount.toString()
                }
            }
        }
}