package com.example.nested_recyclerview.activities

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nested_recyclerview.models.ParentModel
import com.example.nested_recyclerview.adapters.ParentRVAdapter
import com.example.nested_recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private var parentAdapter: ParentRVAdapter? = null
    private val parentModelArrayList: ArrayList<ParentModel> = ArrayList()
    private var parentLayoutManager: RecyclerView.LayoutManager? = null

    @SuppressLint("NotifyDataSetChanged")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        parentModelArrayList.add(ParentModel("Category1"))
        parentModelArrayList.add(ParentModel("Category2"))
        parentModelArrayList.add(ParentModel("Category3"))
        parentModelArrayList.add(ParentModel("Category4"))
        parentModelArrayList.add(ParentModel("Category5"))
        parentModelArrayList.add(ParentModel("Category6"))

        binding.parentRV.setHasFixedSize(true)
        parentLayoutManager = LinearLayoutManager(this)
        parentAdapter = ParentRVAdapter(parentModelArrayList, this)
        binding.parentRV.layoutManager = parentLayoutManager
        binding.parentRV.adapter = parentAdapter
        (parentAdapter as ParentRVAdapter).notifyDataSetChanged()
    }
}