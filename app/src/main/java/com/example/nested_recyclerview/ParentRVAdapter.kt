package com.example.nested_recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nested_recyclerview.databinding.ItemsParentRecyclerviewBinding


class ParentRVAdapter(
    private val parentModelArrayList: ArrayList<ParentModel>,
    private val context: Context
) : RecyclerView.Adapter<ParentRVAdapter.ViewHolder>() {

    class ViewHolder(val viewBinding: ItemsParentRecyclerviewBinding) :
        RecyclerView.ViewHolder(viewBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewBinding = ItemsParentRecyclerviewBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(viewBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem: ParentModel = parentModelArrayList[position]
        val lm: RecyclerView.LayoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        holder.viewBinding.childRV.layoutManager = lm
        holder.viewBinding.childRV.setHasFixedSize(true)

        holder.viewBinding.movieCategoryTV.text = currentItem.movieCategory
        val arrayList: ArrayList<ChildModel> = ArrayList()

        if (parentModelArrayList[position].movieCategory == ("Category1")) {
            arrayList.add(ChildModel(R.drawable.ic_bollywood, "Sub1 Movie1"))
            arrayList.add(ChildModel(R.drawable.ic_bollywood, "Sub1 Movie2"))
            arrayList.add(ChildModel(R.drawable.ic_bollywood, "Sub1 Movie3"))
            arrayList.add(ChildModel(R.drawable.ic_bollywood, "Sub1 Movie4"))
            arrayList.add(ChildModel(R.drawable.ic_bollywood, "Sub1 Movie4"))
            arrayList.add(ChildModel(R.drawable.ic_bollywood, "Sub1 Movie5"))
        }

        if (parentModelArrayList[position].movieCategory == ("Category2")) {
            arrayList.add(ChildModel(R.drawable.ic_halloween, "Sub2 Movie1"))
            arrayList.add(ChildModel(R.drawable.ic_halloween, "Sub2 Movie2"))
            arrayList.add(ChildModel(R.drawable.ic_halloween, "Sub2 Movie3"))
            arrayList.add(ChildModel(R.drawable.ic_halloween, "Sub2 Movie4"))
            arrayList.add(ChildModel(R.drawable.ic_halloween, "Sub2 Movie5"))
            arrayList.add(ChildModel(R.drawable.ic_halloween, "Sub2 Movie6"))
        }

        if (parentModelArrayList[position].movieCategory == ("Category3")) {
            arrayList.add(ChildModel(R.drawable.ic_bollywood, "Sub3 Movie1"))
            arrayList.add(ChildModel(R.drawable.ic_bollywood, "Sub3 Movie2"))
            arrayList.add(ChildModel(R.drawable.ic_bollywood, "Sub3 Movie3"))
            arrayList.add(ChildModel(R.drawable.ic_bollywood, "Sub3 Movie3"))
            arrayList.add(ChildModel(R.drawable.ic_bollywood, "Sub3 Movie3"))
            arrayList.add(ChildModel(R.drawable.ic_bollywood, "Sub3 Movie3"))
        }

        if (parentModelArrayList[position].movieCategory == ("Category4")) {
            arrayList.add(ChildModel(R.drawable.ic_halloween, "Su4 Movie1"))
            arrayList.add(ChildModel(R.drawable.ic_halloween, "Sub4 Movie2"))
            arrayList.add(ChildModel(R.drawable.ic_halloween, "Sub4 Movie3"))
            arrayList.add(ChildModel(R.drawable.ic_halloween, "Sub4 Movie4"))
            arrayList.add(ChildModel(R.drawable.ic_halloween, "Sub4 Movie5"))
            arrayList.add(ChildModel(R.drawable.ic_halloween, "Sub4 Movie6"))
        }

        if (parentModelArrayList[position].movieCategory == ("Category5")) {
            arrayList.add(ChildModel(R.drawable.ic_bollywood, "Sub5 Movie1"))
            arrayList.add(ChildModel(R.drawable.ic_bollywood, "Sub5 Movie2"))
            arrayList.add(ChildModel(R.drawable.ic_bollywood, "Sub5 Movie3"))
            arrayList.add(ChildModel(R.drawable.ic_bollywood, "Sub5 Movie4"))
            arrayList.add(ChildModel(R.drawable.ic_bollywood, "Sub5 Movie5"))
            arrayList.add(ChildModel(R.drawable.ic_bollywood, "Sub5 Movie6"))
        }

        if (parentModelArrayList[position].movieCategory == ("Category6")) {
            arrayList.add(ChildModel(R.drawable.ic_halloween, "Sub6 Movie1"))
            arrayList.add(ChildModel(R.drawable.ic_halloween, "Sub6 Movie2"))
            arrayList.add(ChildModel(R.drawable.ic_halloween, "Sub6 Movie3"))
            arrayList.add(ChildModel(R.drawable.ic_halloween, "Sub6 Movie4"))
            arrayList.add(ChildModel(R.drawable.ic_halloween, "Sub6 Movie5"))
            arrayList.add(ChildModel(R.drawable.ic_halloween, "Sub6 Movie6"))
        }

        val childRVAdapter = ChildRVAdapter(arrayList, holder.viewBinding.childRV.context)
        holder.viewBinding.childRV.adapter = childRVAdapter
    }

    override fun getItemCount(): Int {
        return parentModelArrayList.size
    }
}