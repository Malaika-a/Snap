package com.malaika.snap

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.malaika.snap.R.menu.options_menu
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
val toolbar=findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)

    val navHostFragment=supportFragmentManager.findFragmentById(R.id.navigate) as NavHostFragment
        navController = navHostFragment.navController
        val bottomnav=findViewById<BottomNavigationView>(R.id.bottomnavmenu)
        bottomnav.setupWithNavController(navController)
       }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.context_menu,menu)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.options_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.delete->{
            Toast.makeText(this,"Deleted",Toast.LENGTH_SHORT).show()
            return true}
            R.id.copy->{
                Toast.makeText(this,"copied",Toast.LENGTH_SHORT).show()
                return true}
            R.id.share->{
                Toast.makeText(this,"shared",Toast.LENGTH_SHORT).show()
                return true}
            R.id.forward->{
                Toast.makeText(this,"forward",Toast.LENGTH_SHORT).show()
                return true}

            else -> super.onOptionsItemSelected(item)
        }
    }
    }



