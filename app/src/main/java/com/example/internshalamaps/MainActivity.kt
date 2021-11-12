package com.example.internshalamaps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv=findViewById<RecyclerView>(R.id.rvView)
        val cities= arrayListOf<CityData>()
        val cityAdapter:CityAdapter
        val layoutManager:RecyclerView.LayoutManager

        cities.add(CityData("Toronto",647))
        cities.add(CityData("Mississauga",289))
        cities.add(CityData("Oakville",905))
        cities.add(CityData("Hamilton",513))
        cities.add(CityData("North York",416))

        layoutManager=LinearLayoutManager(this)
        cityAdapter=CityAdapter(cities)
        rv.adapter=cityAdapter
        rv.layoutManager=layoutManager
        cityAdapter.setonItemClickListener(object :CityAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {
                val j=cities[position].name
                val i=Intent(this@MainActivity,TravelAgencies::class.java)
                i.putExtra("city",j)
                startActivity(i)
            }
        })
    }
}