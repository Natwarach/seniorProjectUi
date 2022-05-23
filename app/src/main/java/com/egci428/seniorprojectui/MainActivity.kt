package com.egci428.seniorprojectui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.egci428.seniorprojectui.adapter.RecyclerAdapter
import com.egci428.seniorprojectui.fragment.RouteMapFragment
import com.egci428.seniorprojectui.fragment.StationsFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private val routeMapFragment = RouteMapFragment()
    private val stationsFragment = StationsFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//--------------starting page (Route Map)
        setContentView(R.layout.activity_main)
        replaceFragment(routeMapFragment)

//--------------set on click on listener
        val bottomNavView = findViewById<BottomNavigationView>(R.id.bottom_nav_view)

        bottomNavView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.nav_routemap -> replaceFragment(routeMapFragment)
                R.id.nav_stations -> replaceFragment(stationsFragment)
            }
            true
        }

    }

    private fun replaceFragment(fragment: Fragment){
        if(fragment != null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()
        }
    }
}