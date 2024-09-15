package com.example.worldcupapp.recyclerView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.worldcupapp.R
import com.example.worldcupapp.adapter.VaccineAdapter
import com.example.worldcupapp.model.CountryModel
import com.example.worldcupapp.model.VaccineModel

class VaccineAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vaccine_app)

        //1. AdapterView: RecyclerView
        val recyclerView :RecyclerView = findViewById(R.id.VaccineRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL,false)


        //2. Adapter
        val adapter = VaccineAdapter(this,generateData())
        recyclerView.adapter = adapter

    }

    //3. Data Source : List of VaccineModel Objects
    fun generateData(): ArrayList<VaccineModel>{
        var vaccinesList : ArrayList<VaccineModel> = ArrayList()

        val v1 : VaccineModel = VaccineModel("COVID 19",R.drawable.vaccine1)
        val v2 : VaccineModel = VaccineModel("Hepatitis B Vaccine",R.drawable.vaccine2)
        val v3 : VaccineModel = VaccineModel("Tatanus Vaccine",R.drawable.vaccine3)
        val v4 : VaccineModel = VaccineModel("Pneumococal Vaccine",R.drawable.vaccine4)
        val v5 : VaccineModel = VaccineModel("Rotavirus Vaccine",R.drawable.vaccine5)
        val v6 : VaccineModel = VaccineModel("Measles Vaccine",R.drawable.vaccine6)

        vaccinesList.add(v1)
        vaccinesList.add(v2)
        vaccinesList.add(v3)
        vaccinesList.add(v4)
        vaccinesList.add(v5)
        vaccinesList.add(v6)

        return vaccinesList
    }
}