package com.jerry.boozingo.view.activites

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.jerry.boozingo.R
import com.jerry.boozingo.model.Users
import com.jerry.boozingo.view.util.CustomAdapter
import kotlinx.android.synthetic.main.fragment_city_bars.*

class CityBarsFragment : Fragment() {

    private val adapterBar = CustomAdapter(arrayListOf())

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_city_bars, container, false)
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



        recyclerViewBar.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = adapterBar
        }
        adapterBar.updateUserList(users)

        city.setOnClickListener {
            (activity as MainActivity).openCloseNavigationDrawer()
        }


    }
}