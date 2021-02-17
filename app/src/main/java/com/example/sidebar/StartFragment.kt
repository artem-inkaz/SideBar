package com.example.sidebar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.mobiledevelopernotes.utilits.APP_ACTIVITY
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.fragment_start.*

class StartFragment : Fragment(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nav_view.setNavigationItemSelectedListener (this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.id_account_menu -> APP_ACTIVITY.navController.navigate(R.id.action_startFragment_to_secondFragment)
            R.id.location_menu -> APP_ACTIVITY.navController.navigate(R.id.action_startFragment_to_thirdFragment)

            R.id.tools_menu -> Toast.makeText(context,"tools_menu", Toast.LENGTH_SHORT).show()
            R.id.tour_menu -> Toast.makeText(context,"tour_menu", Toast.LENGTH_SHORT).show()
            R.id.useful_materials_menu -> Toast.makeText(context,"useful_materials_menu", Toast.LENGTH_SHORT).show()
        }

        return true
    }

}