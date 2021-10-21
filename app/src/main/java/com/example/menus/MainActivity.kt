package com.example.menus

import android.annotation.SuppressLint
import android.graphics.drawable.InsetDrawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.PopupMenu
import androidx.annotation.MenuRes
import androidx.appcompat.view.menu.MenuBuilder
import androidx.databinding.DataBindingUtil
import com.example.menus.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        setSupportActionBar(binding?.topAppBar)



        binding?.topAppBar?.setOnMenuItemClickListener { menuItem: MenuItem ->

            when(menuItem.itemId) {

                //R.id.favoritesMenu -> {

                    //прописываем код для запуска действия при тапе по пункту меню

                   // true

               // }

               // R.id.accountMenu -> {

                    //прописываем код для запуска действия при тапе по пункту меню

                  //  true

                //}


                else -> false
            }

        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {

        val menuInflater = menuInflater
        menuInflater.inflate(R.menu.menu, menu)


        return true
    }



}