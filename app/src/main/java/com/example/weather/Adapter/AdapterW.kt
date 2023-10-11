package com.example.weather.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.weather.WeatherInfo
import com.example.weather.databinding.WeatherBinding

class AdapterW (val list:List<WeatherInfo>):RecyclerView.Adapter<AdapterW.MyHolder>(){
    class MyHolder(binding:WeatherBinding):RecyclerView.ViewHolder(binding.root){
        val day = binding.textView
        val dayTemp = binding.textView3
        val nightTemp = binding.textView4
        val condition = binding.textView2
        val image = binding.imageView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        return MyHolder(WeatherBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.day.text = list[position].day
        holder.dayTemp.text = list[position].dayTemp
        holder.nightTemp.text = list[position].nightTemp
        holder.condition.text = list[position].condition
        holder.image.setBackgroundResource(list[position].img)
    }
}