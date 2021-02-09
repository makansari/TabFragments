package com.example.tabfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)

        var myadapter = ViewPagerAdapter(supportFragmentManager)
        myadapter.addFragment(GreenFragment(),"GREEN")
        myadapter.addFragment(RedFragment(),"RED")

        viewPager.adapter = myadapter

        tabs.setupWithViewPager(viewPager)


    }
}