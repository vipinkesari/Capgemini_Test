package com.myinfosysprogram.adapter

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.myinfosysprogram.R
import com.myinfosysprogram.constants.AppConstants
import com.myinfosysprogram.databinding.ItemHomeRvBinding
import com.myinfosysprogram.model.response.WeatherDailyResponse
import com.myinfosysprogram.utils.getDateString
import com.squareup.picasso.Picasso

class ListDataViewHolder(private val itemHomeRvBinding: ItemHomeRvBinding) :
    RecyclerView.ViewHolder(itemHomeRvBinding.root) {

    fun bind(res: WeatherDailyResponse, context: Context?) {
        itemHomeRvBinding.tempTv.text = (res.temp?.day.toString())
        "${context?.getString(R.string.hint_Feels_Like)}: ${res.feels_like?.eve}".also {
            itemHomeRvBinding.feelsTv.text = it
        }

        val date = getDateString(res.dt)
        "${context?.getString(R.string.hint_date)}: ${date.split(",")[0]}".also {
            itemHomeRvBinding.dateTv.text = it
        }

        res.weather?.first()?.let {
            val imgPath = "${AppConstants.IMAGE_URL}${it.icon}${AppConstants.IMAGE_TYPE}"
            if (imgPath.isNotEmpty()) {
                if (context != null) {
                    Picasso.get()
                        .load(imgPath)
                        .placeholder(R.drawable.placeholder)
                        .error(R.drawable.placeholder)
                        .into(itemHomeRvBinding.photoIv)
                }
            }
        }
    }
}