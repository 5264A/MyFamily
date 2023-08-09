package com.example.familysafety

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainactivity)

       val bottombar=findViewById<BottomNavigationView>(R.id.bottom_bar)

        bottombar.setOnItemSelectedListener {menuitem->
            if(menuitem.itemId==R.id.nav_home){
              inflateFragment()
            }
            else if(menuitem.itemId==R.id.nav_home){
                inflateHomeFragement()
            }
            else if(menuitem.itemId==R.id.nav_profile){
                inflateProfileFragement()
            }
            else if(menuitem.itemId==R.id.nav_dashboard){
                inflateDashboradFragement()
            }
            true
        }



    }

    private fun inflateDashboradFragement() {
        val transaction=supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,Dashboard.newInstance())
        transaction.commit()
    }

    private fun inflateProfileFragement() {
        val transaction=supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,Profile.newInstance())
        transaction.commit()
    }

    private fun inflateHomeFragement() {
        val transaction=supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,HomeFragment.newInstance())
        transaction.commit()

    }

    private fun inflateFragment() {
       val transaction=supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,GuardFragment.newInstance())
        transaction.commit()

    }


}