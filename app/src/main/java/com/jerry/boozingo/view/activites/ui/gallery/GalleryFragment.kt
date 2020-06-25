package com.jerry.boozingo.view.activites.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.HorizontalScrollView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.jerry.boozingo.R
import com.jerry.boozingo.model.Users
import com.jerry.boozingo.view.util.BarAdapter
import kotlinx.android.synthetic.main.booplaces.*

class GalleryFragment : Fragment() {

    private val adapterBar = BarAdapter(arrayListOf())


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


        val users = ArrayList<Users>()
        val image: Int = R.drawable.barimg
        users.add(
            Users(
                "Lucknow Night's club",
                "vibhuti khand,gomtinagar,lucknow",
                image,
                "12am-12pm"
            )
        )
        users.add(
            Users(
                "Bombay Club",
                "vibhuti khand,gomtinagar,lucknow",
                image,
                "12am-12pm"
            )
        )
        users.add(
            Users(
                "Midnight Bar",
                "vibhuti khand,gomtinagar,lucknow",
                image,
                "12am-12pm"
            )
        )
        users.add(
            Users(
                "Lucknow Night's club",
                "vibhuti khand,gomtinagar,lucknow",
                image,
                "12am-12pm"
            )
        )
        users.add(
            Users(
                "Lucknow Night's club",
                "vibhuti khand,gomtinagar,lucknow",
                image,
                "12am-12pm"
            )
        )
        users.add(
            Users(
                "Bombay Club",
                "vibhuti khand,gomtinagar,lucknow",
                image,
                "12am-12pm"
            )
        )
        users.add(
            Users(
                "Midnight Bar",
                "vibhuti khand,gomtinagar,lucknow",
                image,
                "12am-12pm"
            )
        )
        users.add(
            Users(
                "Lucknow Night's club",
                "vibhuti khand,gomtinagar,lucknow",
                image,
                "12am-12pm"
            )
        )
        users.add(
            Users(
                "Lucknow Night's club",
                "vibhuti khand,gomtinagar,lucknow",
                image,
                "12am-12pm"
            )
        )
        users.add(
            Users(
                "Bombay Club",
                "vibhuti khand,gomtinagar,lucknow",
                image,
                "12am-12pm"
            )
        )
        users.add(
            Users(
                "Midnight Bar",
                "vibhuti khand,gomtinagar,lucknow",
                image,
                "12am-12pm"
            )
        )
        users.add(
            Users(
                "Lucknow Night's club",
                "vibhuti khand,gomtinagar,lucknow",
                image,
                "12am-12pm"
            )
        )



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
        adapterBar.updateUserList(users)

        //city.setOnClickListener {
        //  (activity as MainActivity).openCloseNavigationDrawer()
        //}


    }

}