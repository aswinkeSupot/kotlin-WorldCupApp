package com.example.worldcupapp.listView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.worldcupapp.R
import com.example.worldcupapp.adapter.CountryAdapter
import com.example.worldcupapp.model.CountryModel

class WorldCupAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_world_cup_app)

        //1. AdapterView: ListView
        var listView = findViewById<ListView>(R.id.WorldCupListView)

            //2. Adapter
        var adapter = CountryAdapter(this,generateData())

        listView?.adapter = adapter
        adapter?.notifyDataSetChanged()

    }

    //3. Data Source
    fun generateData(): ArrayList<CountryModel>{
        var countryList = ArrayList<CountryModel>()

        var country1: CountryModel = CountryModel("Brazil","5",R.drawable.brazil)
        var country2: CountryModel = CountryModel("Germany","4",R.drawable.germany)
        var country3: CountryModel = CountryModel("France","2",R.drawable.france)
        var country4: CountryModel = CountryModel("Spain","1",R.drawable.spain)
        var country5: CountryModel = CountryModel("England","1",R.drawable.england)
        var country6: CountryModel = CountryModel("United States","0",R.drawable.united_states)

        countryList.add(country1)
        countryList.add(country2)
        countryList.add(country3)
        countryList.add(country4)
        countryList.add(country5)
        countryList.add(country6)

        return countryList
    }
}