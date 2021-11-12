package com.example.internshalamaps

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CityAdapter(val city:ArrayList<CityData>): RecyclerView.Adapter<CityAdapter.CityViewHolder>() {
    private lateinit var mListener:onItemClickListener

    interface onItemClickListener {
        fun onItemClick(position: Int)
    }

    fun setonItemClickListener (listener:onItemClickListener){
        mListener=listener
    }

    class CityViewHolder (val view: View, listener:onItemClickListener): RecyclerView.ViewHolder(view) {
        val name=view.findViewById<TextView>(R.id.tvname)
        val code=view.findViewById<TextView>(R.id.tvcode)

        init {
            view.setOnClickListener{
                listener.onItemClick(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder {
        val v= LayoutInflater.from(parent.context).inflate(R.layout.city_single,parent,false)
        return CityViewHolder(v,mListener)
    }

    override fun onBindViewHolder(holder: CityAdapter.CityViewHolder, position: Int) {
        val x=city[position]
        holder.name.text=x.name
        holder.code.text=x.code.toString()
    }

    override fun getItemCount(): Int {
        return city.size
    }
}