package com.egci428.seniorprojectui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.egci428.seniorprojectui.R

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    //create Array according to a number of itemView

    private var btsLgEngNames = arrayOf("Khu Khot", "Yaek Kor Por Aor", "Royal Thai Air Force Museum", "Bhumibol Adulyadej Hospital", "Saphan Mai")
    private var btsLgThaiNames = arrayOf("คูคต", "แยก คปอ.", "พิพิธภัณฑ์กองทัพอากาศ", "โรงพยาบาลภูมิพลอดุลยเดช", "สะพานใหม่")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        //inflate the card layout and pass the View object
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false) //create View object
        return ViewHolder(v) //pass View object to ViewHolder and return
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemEngNameText.text = btsLgEngNames[position]
        holder.itemThaiNameText.text = btsLgThaiNames[position]
    }

    override fun getItemCount(): Int {
        return btsLgEngNames.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) { //ViewHolder class will get itemView object with View type + pass itemView to the ViewHolderClass
        //var itemNameImage: ImageView
        //var itemCodeImage: ImageView
        var itemEngNameText: TextView
        var itemThaiNameText: TextView

        init {
            //itemNameImage = itemView.findViewById(R.id.lineNameImg)
            //itemCodeImage = itemView.findViewById(R.id.lineIdImg)
            itemEngNameText = itemView.findViewById(R.id.engStationName)
            itemThaiNameText = itemView.findViewById(R.id.thaiStationName)

            //object View that will be passed to the onCreateViewHolder
        }
    }

}