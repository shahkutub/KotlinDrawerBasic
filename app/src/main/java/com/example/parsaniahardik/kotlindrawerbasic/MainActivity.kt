package com.example.parsaniahardik.kotlindrawerbasic

import android.content.Context

import android.os.Bundle
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var context:Context? = null
    private var toolbar: Toolbar? = null
    private var drawerFragment: DrawerFragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        context = this
        toolbar = findViewById<View>(R.id.toolbar) as Toolbar?

        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayShowHomeEnabled(true)
        drawerFragment = supportFragmentManager.findFragmentById(R.id.fragment_navigation_drawer) as DrawerFragment
        drawerFragment!!.setUpDrawer(R.id.fragment_navigation_drawer, findViewById<View>(R.id.drawer_layout) as DrawerLayout, toolbar!!)

        Toast.makeText(context, "Its toast!", Toast.LENGTH_SHORT).show()

    }


}
