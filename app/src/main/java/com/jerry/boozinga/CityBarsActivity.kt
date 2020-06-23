package com.jerry.boozinga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CursorAdapter
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jerry.boozinga.Adapter.CustomAdapter

var image:Int = R.drawable.barimg

class CityBarsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_city_bars)

        val recyclerView = findViewById<RecyclerView>(R.id.Recyclerview_bar)

        val users = ArrayList<Users>()

        users.add(Users("Lucknow Night's club","vibhuti khand,gomtinagar,lucknow", image,"12am-12pm"))
        users.add(Users("Bombay Club","vibhuti khand,gomtinagar,lucknow", image,"12am-12pm"))
        users.add(Users("Midnight Bar","vibhuti khand,gomtinagar,lucknow", image,"12am-12pm"))
        users.add(Users("Lucknow Night's club","vibhuti khand,gomtinagar,lucknow", image,"12am-12pm"))
        users.add(Users("Lucknow Night's club","vibhuti khand,gomtinagar,lucknow", image,"12am-12pm"))
        users.add(Users("Bombay Club","vibhuti khand,gomtinagar,lucknow", image,"12am-12pm"))
        users.add(Users("Midnight Bar","vibhuti khand,gomtinagar,lucknow", image,"12am-12pm"))
        users.add(Users("Lucknow Night's club","vibhuti khand,gomtinagar,lucknow", image,"12am-12pm"))
        users.add(Users("Lucknow Night's club","vibhuti khand,gomtinagar,lucknow", image,"12am-12pm"))
        users.add(Users("Bombay Club","vibhuti khand,gomtinagar,lucknow", image,"12am-12pm"))
        users.add(Users("Midnight Bar","vibhuti khand,gomtinagar,lucknow", image,"12am-12pm"))
        users.add(Users("Lucknow Night's club","vibhuti khand,gomtinagar,lucknow", image,"12am-12pm"))

        val adapter = CustomAdapter(users)

        recyclerView.adapter = adapter
    }
}