package com.example.worldcupapp.listView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.worldcupapp.R

class SimpleListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_list)

        var listview : ListView = findViewById(R.id.listView)

        val world_cup_array = arrayOf("Germany","Brazil","England","Spain","Qatar")

        val arrayAdapter: ArrayAdapter<*>
        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,world_cup_array)
        listview.adapter = arrayAdapter
    }
}