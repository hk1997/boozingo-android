package com.jerry.boozingo.view.activites.ui.citybars

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.jerry.boozingo.R
import com.jerry.boozingo.view.activites.MainActivity
import com.jerry.boozingo.view.util.CustomAdapter
import kotlinx.android.synthetic.main.booplaces.*
import kotlinx.android.synthetic.main.fragment_city_bars.*

class CityBarsFragment : Fragment() {

    private val adapterBar = CustomAdapter(arrayListOf())
    private lateinit var viewModel: CityBarsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_city_bars, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        viewModel = ViewModelProviders.of(this)
            .get(CityBarsViewModel::class.java)  // viewmodel bana raha hu
        viewModel.refresh()  // API se server call kara


        recyclerViewBar.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = adapterBar
        }

        observeViewModel() // viewmodel ko observe kara
    }

    fun observeViewModel() {
        viewModel.boozePlaces.observe(viewLifecycleOwner, Observer { boozePlaces ->
            boozePlaces?.let {
                recyclerViewBar.visibility = View.VISIBLE
                adapterBar.updateUserList(boozePlaces) //if viewmodel has received data then sending data to adapter
            }
        })

    }

}