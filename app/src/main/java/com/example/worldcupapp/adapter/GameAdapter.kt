package com.example.worldcupapp.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.worldcupapp.R
import com.example.worldcupapp.model.TopGameModel
import com.example.worldcupapp.model.VaccineModel

class GameAdapter(private var activity: Activity,private val gameList : ArrayList<TopGameModel>): RecyclerView.Adapter<GameAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        lateinit var gameImage: ImageView
        lateinit var gameTitle: TextView
        lateinit var mainCardItem : CardView

        init {
            gameImage = itemView.findViewById(R.id.gameImage)
            gameTitle = itemView.findViewById(R.id.GameTitleTxt)

            mainCardItem = itemView.findViewById(R.id.main_card_item)

            /**
             * Can use below code for onclick listener with the itemView
             **/
            //itemView.setOnClickListener(){
            //    Toast.makeText(itemView.context, gameList[adapterPosition].nameTxt, Toast.LENGTH_LONG).show()
            //}

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.top_game_item, parent, false)

        return MyViewHolder(v)
    }

    override fun getItemCount(): Int {
        return gameList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.gameTitle.text = gameList[position].nameTxt
        holder.gameImage.setImageResource(gameList[position].imageCard)

        holder.mainCardItem.setOnClickListener(){
            Toast.makeText(activity, gameList[position].nameTxt, Toast.LENGTH_LONG).show()
            //Or we can use the below context
            //Toast.makeText(holder.mainCardItem.context, gameList[position].nameTxt, Toast.LENGTH_LONG).show()
        }

    }
}