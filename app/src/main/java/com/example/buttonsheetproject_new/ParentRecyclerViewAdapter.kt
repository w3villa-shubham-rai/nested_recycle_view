package com.example.buttonsheetproject_new

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

private val context: Context? = null

lateinit var parentModelArrayList: ArrayList<ParentModel>

class ParentRecyclerViewAdapter(
    val parentModelArrayList: ArrayList<ParentModel>,
    childFragmentManager: buttonsheetfragment
): RecyclerView.Adapter<ParentRecyclerViewAdapter.MyViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater= LayoutInflater.from(parent.context)
        val view=inflater.inflate(R.layout.parent_recyclerview_items,parent,false)
        return MyViewHolder(view);
    }

    override fun getItemCount(): Int {
        return parentModelArrayList.size

    }

    @SuppressLint("PrivateResource")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = parentModelArrayList[position]
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        holder.Child_RV.layoutManager = layoutManager
        holder.Child_RV.setHasFixedSize(true)
        holder.Movie_category.setText(currentItem.movieCategory);

        val childModelArrayList = java.util.ArrayList<ChildModel>()
        if (parentModelArrayList[position].movieCategory == "Category1") {
            childModelArrayList.add(ChildModel(R.drawable.ic_launcher_background, "Movie Name"))
            childModelArrayList.add(ChildModel(com.google.android.material.R.drawable.ic_clock_black_24dp, "Movie Name"))
            childModelArrayList.add(ChildModel(com.google.android.material.R.drawable.ic_clock_black_24dp, "Movie Name"))
            childModelArrayList.add(ChildModel(com.google.android.material.R.drawable.ic_keyboard_black_24dp, "Movie Name"))
            childModelArrayList.add(ChildModel(com.google.android.material.R.drawable.ic_keyboard_black_24dp, "Movie Name"))
            childModelArrayList.add(ChildModel(com.google.android.material.R.drawable.ic_m3_chip_check, "Movie Name"))
        }

        if (parentModelArrayList[position].movieCategory == "Category2") {
            childModelArrayList.add(ChildModel(R.drawable.ic_launcher_background, "Movie Name"))
            childModelArrayList.add(ChildModel(com.google.android.material.R.drawable.ic_clock_black_24dp, "Movie Name"))
            childModelArrayList.add(ChildModel(com.google.android.material.R.drawable.ic_clock_black_24dp, "Movie Name"))
            childModelArrayList.add(ChildModel(com.google.android.material.R.drawable.ic_keyboard_black_24dp, "Movie Name"))
            childModelArrayList.add(ChildModel(com.google.android.material.R.drawable.ic_keyboard_black_24dp, "Movie Name"))
            childModelArrayList.add(ChildModel(com.google.android.material.R.drawable.ic_m3_chip_check, "Movie Name"))
        }
        if (parentModelArrayList[position].movieCategory == "Category3") {
            childModelArrayList.add(ChildModel(R.drawable.ic_launcher_background, "Movie Name"))
            childModelArrayList.add(ChildModel(com.google.android.material.R.drawable.ic_clock_black_24dp, "Movie Name"))
            childModelArrayList.add(ChildModel(com.google.android.material.R.drawable.ic_clock_black_24dp, "Movie Name"))
            childModelArrayList.add(ChildModel(com.google.android.material.R.drawable.ic_keyboard_black_24dp, "Movie Name"))
            childModelArrayList.add(ChildModel(com.google.android.material.R.drawable.ic_keyboard_black_24dp, "Movie Name"))
            childModelArrayList.add(ChildModel(com.google.android.material.R.drawable.ic_m3_chip_check, "Movie Name"))
        }

        if (parentModelArrayList[position].movieCategory == "Category4") {
            childModelArrayList.add(ChildModel(R.drawable.ic_launcher_background, "Movie Name"))
            childModelArrayList.add(ChildModel(com.google.android.material.R.drawable.ic_clock_black_24dp, "Movie Name"))
            childModelArrayList.add(ChildModel(com.google.android.material.R.drawable.ic_clock_black_24dp, "Movie Name"))
            childModelArrayList.add(ChildModel(com.google.android.material.R.drawable.ic_keyboard_black_24dp, "Movie Name"))
            childModelArrayList.add(ChildModel(com.google.android.material.R.drawable.ic_keyboard_black_24dp, "Movie Name"))
            childModelArrayList.add(ChildModel(com.google.android.material.R.drawable.ic_m3_chip_check, "Movie Name"))
        }
        if (parentModelArrayList[position].movieCategory == "Category5") {
            childModelArrayList.add(ChildModel(R.drawable.ic_launcher_background, "Movie Name"))
            childModelArrayList.add(ChildModel(com.google.android.material.R.drawable.ic_clock_black_24dp, "Movie Name"))
            childModelArrayList.add(ChildModel(com.google.android.material.R.drawable.ic_clock_black_24dp, "Movie Name"))
            childModelArrayList.add(ChildModel(com.google.android.material.R.drawable.ic_keyboard_black_24dp, "Movie Name"))
            childModelArrayList.add(ChildModel(com.google.android.material.R.drawable.ic_keyboard_black_24dp, "Movie Name"))
            childModelArrayList.add(ChildModel(com.google.android.material.R.drawable.ic_m3_chip_check, "Movie Name"))
        }



        val childRecyclerViewAdapter = ChildRecyclerViewAdapter(childModelArrayList, holder.Child_RV.context)
        holder.Child_RV.adapter = childRecyclerViewAdapter







    }
    class MyViewHolder (itemView:View):RecyclerView.ViewHolder(itemView){
        val Movie_category=itemView.findViewById<TextView>(R.id.Movie_category);
        val Child_RV=itemView.findViewById<RecyclerView>(R.id.Child_RV);

    }
}