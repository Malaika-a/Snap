package com.malaika.snap

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
    val navHostFragment=supportFragmentManager.findFragmentById(R.id.navigate) as NavHostFragment
        navController = navHostFragment.navController
        val bottomnav=findViewById<BottomNavigationView>(R.id.bottomnavmenu)
        bottomnav.setupWithNavController(navController)
    }
}