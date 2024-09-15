package com.example.worldcupapp.listView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.worldcupapp.R

class CustomListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_list)

        var listview : ListView = findViewById(R.id.customListView)

        val world_cup_array = arrayOf("Germany","Brazil","England","Spain","Qatar")

        val arrayAdapter: ArrayAdapter<*>
        arrayAdapter = ArrayAdapter(this,
            R.layout.list_item,
            R.id.titleText,
            world_cup_array)
        listview.adapter = arrayAdapter
    }
}