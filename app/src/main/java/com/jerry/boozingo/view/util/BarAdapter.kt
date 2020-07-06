package com.jerry.boozingo.view.util

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jerry.boozingo.R
import com.jerry.boozingo.model.BoozePlace
import com.jerry.boozingo.model.Users

class BarAdapter(val boozePlaceList: ArrayList<BoozePlace>) :
    RecyclerView.Adapter<BarAdapter.ViewHolder>() {

    fun updateUserList(newBoozePlaceList: List<BoozePlace>) {
        boozePlaceList.clear()
        boozePlaceList.addAll(newBoozePlaceList)
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val bar_name1 = itemView.findViewById<TextView>(R.id.bar_nam)
        val bar_address1 = itemView.findViewById<TextView>(R.id.bar1_addr)
        val bar_time1 = itemView.findViewById<TextView>(R.id.bar1_tym)
        val bar_image1 = itemView.findViewById<ImageView>(R.id.image1_bar)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.horizontalcardview, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return boozePlaceList.size
    }



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {



        val boozePlace = boozePlaceList[position]

        holder.bar_name1?.text = boozePlace.placeName
        holder.bar_address1?.text = boozePlace.placeAdress
        holder.bar_time1?.text = boozePlace.placeTime
        holder.bar_image1?.setImageResource(R.drawable.barimg)


    }
    }
