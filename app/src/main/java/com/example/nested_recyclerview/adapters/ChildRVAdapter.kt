package com.example.nested_recyclerview.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nested_recyclerview.databinding.ItemsChildRecyclerviewBinding
import com.example.nested_recyclerview.models.ChildModel

class ChildRVAdapter(
    private val childModelArrayList: ArrayList<ChildModel>,
    val mContext: Context
) : RecyclerView.Adapter<ChildRVAdapter.ViewHolder>() {

    class ViewHolder(val viewBinding: ItemsChildRecyclerviewBinding) :
        RecyclerView.ViewHolder(viewBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewBinding = ItemsChildRecyclerviewBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(viewBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem: ChildModel = childModelArrayList[position]
        holder.viewBinding.heroImageIV.setImageResource(currentItem.heroImage)
        holder.viewBinding.movieNameTV.text = currentItem.movieName
    }

    override fun getItemCount(): Int {
        return childModelArrayList.size
    }
}