package com.example.sidebar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        nav_view.setNavigationItemSelectedListener (this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.id_account_menu -> Toast.makeText(this,"id_account_menu",Toast.LENGTH_SHORT).show()
            R.id.location_menu -> Toast.makeText(this,"location_menu",Toast.LENGTH_SHORT).show()
            R.id.tools_menu -> Toast.makeText(this,"tools_menu",Toast.LENGTH_SHORT).show()
            R.id.tour_menu -> Toast.makeText(this,"tour_menu",Toast.LENGTH_SHORT).show()
            R.id.useful_materials_menu -> Toast.makeText(this,"useful_materials_menu",Toast.LENGTH_SHORT).show()
        }

        return true
    }
}