

package com.example.worldcupapp.recyclerView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.worldcupapp.R
import com.example.worldcupapp.adapter.GameAdapter
import com.example.worldcupapp.adapter.VaccineAdapter
import com.example.worldcupapp.model.TopGameModel
import com.example.worldcupapp.model.VaccineModel

class TopGameAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top_game_app)

        //1. AdapterView: RecyclerView
        val recyclerView : RecyclerView = findViewById(R.id.TopGameRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL,false)

        //Adapter
        val adapter = GameAdapter(this,generateData())
        recyclerView.adapter = adapter
    }

    //3. Data Source : List of TopGameModel Objects
    fun generateData(): ArrayList<TopGameModel>{
        var gameList : ArrayList<TopGameModel> = ArrayList()

        val g1 : TopGameModel = TopGameModel(R.drawable.game1,"Horizone Chase")
        val g2 : TopGameModel = TopGameModel(R.drawable.game2,"PUBG")
        val g3 : TopGameModel = TopGameModel(R.drawable.game3,"Head Ball 2")
        val g4 : TopGameModel = TopGameModel(R.drawable.game4,"FIFA 2022")
        val g5 : TopGameModel = TopGameModel(R.drawable.game5,"Fortnite")
        val g6 : TopGameModel = TopGameModel(R.drawable.game6,"Hooked on You")

        gameList.add(g1)
        gameList.add(g2)
        gameList.add(g3)
        gameList.add(g4)
        gameList.add(g5)
        gameList.add(g6)

        return gameList
    }
}