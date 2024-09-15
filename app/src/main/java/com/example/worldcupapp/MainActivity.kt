package com.example.worldcupapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.worldcupapp.listView.CustomListActivity
import com.example.worldcupapp.listView.SimpleListActivity
import com.example.worldcupapp.listView.WorldCupAppActivity
import com.example.worldcupapp.recyclerView.TopGameAppActivity
import com.example.worldcupapp.recyclerView.VaccineAppActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun ListTypeButtonClick(view: View){
        val clickedButton : Button = view as Button

        when (clickedButton.tag.toString()){
            //Simple List View Activity
            "SimpleListViewBtn" -> {
                var intent: Intent = Intent(this, SimpleListActivity::class.java)
                startActivity(intent)
            }
            "CustomListViewBtn" -> {
                var intent: Intent = Intent(this, CustomListActivity::class.java)
                startActivity(intent)
            }
            "WorldCupAppBtn" -> {
                var intent: Intent = Intent(this, WorldCupAppActivity::class.java)
                startActivity(intent)
            }
            "VaccineAppBtn" -> {
                var intent: Intent = Intent(this, VaccineAppActivity::class.java)
                startActivity(intent)
            }
            "TopGameAppBtn" -> {
                var intent: Intent = Intent(this, TopGameAppActivity::class.java)
                startActivity(intent)
            }
            else -> {
                print("Other Button Clicked")
            }

        }
    }
}