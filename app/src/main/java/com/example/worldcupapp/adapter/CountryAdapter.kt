package com.example.worldcupapp.adapter

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.worldcupapp.R
import com.example.worldcupapp.model.CountryModel

class CountryAdapter(private var activity: Activity, private var items: ArrayList<CountryModel>) : BaseAdapter() {
    override fun getCount(): Int {
        return items.size
    }

    override fun getItem(position: Int): CountryModel {
        return items[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View?
        val viewHolder: ViewHolder

        if(convertView == null){
            val inflater = activity?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = inflater.inflate(R.layout.world_cup_list_item,null)
            viewHolder = ViewHolder(view)
            view?.tag = viewHolder
        }else{
            view = convertView
            viewHolder = view.tag as ViewHolder
        }
        var countries = items[position]

        viewHolder.txtName?.text = countries.name
        viewHolder.txtCupWin?.text = countries.cupWins
        viewHolder.imgFlag?.setImageResource(countries.flag_img)

        view?.setOnClickListener(){
            Toast.makeText(activity,"You Clicked : ${countries.name}",Toast.LENGTH_LONG).show()
        }

        return view as View
    }

    private class ViewHolder(row: View?){
        var txtName : TextView? = null
        var txtCupWin: TextView? = null
        var imgFlag: ImageView? = null

        init{
            this.txtName = row?.findViewById(R.id.CountryName)
            this.txtCupWin = row?.findViewById(R.id.TotalWinCount)
            this.imgFlag = row?.findViewById(R.id.FlagImage)
        }
    }
}