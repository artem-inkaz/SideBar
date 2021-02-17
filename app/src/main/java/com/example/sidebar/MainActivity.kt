package com.example.sidebar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.mobiledevelopernotes.utilits.APP_ACTIVITY
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity : AppCompatActivity(){

    private lateinit var buttonMenu: Button
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        APP_ACTIVITY = this
        navController = Navigation.findNavController(this, R.id.nav_host_fragment)

    }

}