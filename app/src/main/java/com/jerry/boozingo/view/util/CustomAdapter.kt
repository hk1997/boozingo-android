package com.jerry.boozingo.view.util

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.jerry.boozingo.R
import com.jerry.boozingo.databinding.BarinLayoutBinding
import com.jerry.boozingo.model.BoozePlace
import com.jerry.boozingo.view.BoozePlaceClickListener

class CustomAdapter(val boozePlaceList: ArrayList<BoozePlace>) :
    RecyclerView.Adapter<CustomAdapter.BoozePlaceViewHolder>(), BoozePlaceClickListener {

    fun updateUserList(newBoozePlaceList: List<BoozePlace>) {
        boozePlaceList.clear()
        boozePlaceList.addAll(newBoozePlaceList)  // data receieved here from fragment
        notifyDataSetChanged()
    }

    class BoozePlaceViewHolder(var view: BarinLayoutBinding) : RecyclerView.ViewHolder(view.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BoozePlaceViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val v = DataBindingUtil.inflate<BarinLayoutBinding>(
            inflater,
            R.layout.barin_layout,
            parent,
            false
        )
        return BoozePlaceViewHolder(v)
    }

    override fun getItemCount() = boozePlaceList.size

    override fun onBindViewHolder(holder: BoozePlaceViewHolder, position: Int) {

        holder.view.boozePlace = boozePlaceList[position]
        holder.view.listener = this
    }

    override fun onBoozePlaceClicked(v: View) {
        //val uuid = v.dogId.text.toString().toInt()
        //val action = ListFragmentDirections.actionDetailFragment()
        // action.dogUuid = uuid
        // Navigation.findNavController(v).navigate(action)
    }

}