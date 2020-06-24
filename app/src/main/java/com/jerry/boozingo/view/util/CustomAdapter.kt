package com.jerry.boozingo.view.util

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jerry.boozingo.R
import com.jerry.boozingo.model.Users

class CustomAdapter(val userList: ArrayList<Users>) :
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    fun updateUserList(newUserList: List<Users>) {
        userList.clear()
        userList.addAll(newUserList)
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
        return userList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val user: Users = userList[position]

        holder.bar_name.text = user.name
        holder.bar_address.text = user.adress
        holder.bar_time.text = user.time
        holder.bar_image.setImageResource(user.img)

    }
}