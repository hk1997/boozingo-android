package com.jerry.boozingo.view.activites.ui.gallery

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.HorizontalScrollView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.observe
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.customview.customView
import com.jerry.boozingo.R
import com.jerry.boozingo.model.*
import com.jerry.boozingo.view.activites.MainActivity
import com.jerry.boozingo.view.activites.ui.citybars.CityBarsFragment
import com.jerry.boozingo.view.activites.ui.citybars.CityBarsViewModel
import com.jerry.boozingo.view.util.BarAdapter
import com.jerry.boozingo.view.util.CustomAdapter
import kotlinx.android.synthetic.main.booplaces.*
import kotlinx.android.synthetic.main.fragment_city_bars.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.*

class GalleryFragment : Fragment(),View.OnClickListener {

    private val adapterBar = BarAdapter(arrayListOf())
    private lateinit var viewModel: GalleryViewModel
    var navController: NavController? = null



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.booplaces, container, false)
        return root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)
        view.findViewById<TextView>(R.id.barsviewall).setOnClickListener ( this )




        viewModel = ViewModelProviders.of(this)
            .get(GalleryViewModel::class.java)  // viewmodel bana raha hu
        viewModel.refresh()  // API se server call kara




        recycler1.apply {
            layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
            adapter = adapterBar
        }
        recycler2.apply {
            layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
            adapter = adapterBar
        }
        recycler3.apply {
            layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
            adapter = adapterBar
        }

        observeViewModel() // viewmodel ko observe kara
    }

    override fun onClick(p0: View?) {
        when(p0!!.id){
            R.id.barsviewall-> navController!!.navigate(R.id.action_galleryFragment_to_cityBarsFragment)
        }

    }


    fun observeViewModel() {
        viewModel.boozePlaces.observe(viewLifecycleOwner, Observer { boozePlaces ->
            boozePlaces?.let {
                recycler1.visibility = View.VISIBLE
                Log.d("manik","${boozePlaces}")

                 adapterBar.updateUserList(boozePlaces)


                //if viewmodel has received data then sending data to adapter
            }
        })

    }

}