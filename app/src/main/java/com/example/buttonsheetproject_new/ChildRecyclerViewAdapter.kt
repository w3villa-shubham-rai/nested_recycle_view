package com.example.buttonsheetproject_new

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



class ChildRecyclerViewAdapter(val childModelArrayList: ArrayList<ChildModel>, context: Context) : RecyclerView.Adapter<ChildRecyclerViewAdapter.MyViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       val inflater=LayoutInflater.from(parent.context)
        val view=inflater.inflate(R.layout.child_recyclerview_items,parent,false)
        return MyViewHolder(view)
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.hero_image.setImageResource(childModelArrayList[position].hero_image);
        holder.movie_name.setText(childModelArrayList[position].movieName);
    }

    override fun getItemCount(): Int {
        return childModelArrayList.size
    }



    class MyViewHolder (itemView:View):RecyclerView.ViewHolder(itemView){

     var hero_image=itemView.findViewById<ImageView>(R.id.hero_image);
        var movie_name=itemView.findViewById<TextView>(R.id.movie_name);

    }

}