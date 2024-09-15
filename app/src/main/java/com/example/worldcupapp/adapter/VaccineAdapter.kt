package com.example.worldcupapp.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.worldcupapp.R
import com.example.worldcupapp.model.VaccineModel

class VaccineAdapter(private var activity: Activity, val vaccinesList : ArrayList<VaccineModel>): RecyclerView.Adapter<VaccineAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        lateinit var vaccineImage: ImageView
        lateinit var vaccineTitle: TextView
        lateinit var main_item : ConstraintLayout

        init {
            vaccineImage = itemView.findViewById(R.id.VaccineImage)
            vaccineTitle = itemView.findViewById(R.id.TitleTxt)

            main_item = itemView.findViewById(R.id.main_item)

            /**
             * Can use below code for onclick listener with the itemView
             **/
            //itemView.setOnClickListener(){
            //    Toast.makeText(itemView.context, vaccinesList[adapterPosition].name, Toast.LENGTH_LONG).show()
            //}

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.vaccine_item, parent, false)

        return MyViewHolder(v)
    }

    override fun getItemCount(): Int {
        return vaccinesList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.vaccineTitle.setText(vaccinesList[position].name)
        holder.vaccineImage.setImageResource(vaccinesList[position].image)

        holder.main_item.setOnClickListener(){
            Toast.makeText(activity, vaccinesList[position].name, Toast.LENGTH_LONG).show()
            //Or we can use the below context
            //Toast.makeText(holder.main_item.context, vaccinesList[position].name, Toast.LENGTH_LONG).show()
        }

    }
}