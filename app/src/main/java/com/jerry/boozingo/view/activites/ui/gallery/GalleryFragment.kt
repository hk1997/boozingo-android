package com.jerry.boozingo.view.activites.ui.gallery

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.jerry.boozingo.R
import com.jerry.boozingo.view.util.BarAdapter
import kotlinx.android.synthetic.main.booplaces.*

class GalleryFragment : Fragment(), View.OnClickListener {

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
        view.findViewById<TextView>(R.id.barsviewall).setOnClickListener(this)


        viewModel = ViewModelProviders.of(this)
            .get(GalleryViewModel::class.java)  // viewmodel bana raha hu
        viewModel.refresh()  // API se server call kara


        recycler1.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = adapterBar
        }
        recycler2.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = adapterBar
        }
        recycler3.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = adapterBar
        }

        observeViewModel() // viewmodel ko observe kara
    }

    override fun onClick(p0: View?) {
        when (p0!!.id) {
            R.id.barsviewall -> navController!!.navigate(R.id.action_galleryFragment_to_cityBarsFragment)
        }

    }


    fun observeViewModel() {
        viewModel.boozePlaces.observe(viewLifecycleOwner, Observer { boozePlaces ->
            boozePlaces?.let {
                recycler1.visibility = View.VISIBLE
                Log.d("manik", "${boozePlaces}")

                adapterBar.updateUserList(boozePlaces)


                //if viewmodel has received data then sending data to adapter
            }
        })

    }

}