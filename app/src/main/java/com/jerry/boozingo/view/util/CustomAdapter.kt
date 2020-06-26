package com.jerry.boozingo.view.util

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jerry.boozingo.R
import com.jerry.boozingo.model.BoozePlace

class CustomAdapter(val boozePlaceList: ArrayList<BoozePlace>) :
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    fun updateUserList(newBoozePlaceList: List<BoozePlace>) {
        boozePlaceList.clear()
        boozePlaceList.addAll(newBoozePlaceList)  // data receieved here from fragment
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val bar_name = itemView.findViewById<TextView>(R.id.bar_name)
        val bar_address = itemView.findViewById<TextView>(R.id.bar_addr)
        val bar_time = itemView.findViewById<TextView>(R.id.bar_tym)
        val bar_image = itemView.findViewById<ImageView>(R.id.image_bar)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.barin_layout, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return boozePlaceList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val boozePlace: BoozePlace = boozePlaceList[position]

        holder.bar_name.text = boozePlace.placeName
        holder.bar_address.text = boozePlace.placeAdress
        holder.bar_time.text = boozePlace.placeTime
        holder.bar_image.setImageResource(R.drawable.barimg)

        /*when(boozePlace.placeType){
            1->
            2->
            3->
        }
        if(boozePlace.placeMusic=="yes")
            holder.musicLogo*/

    }
}