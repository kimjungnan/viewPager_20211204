package com.neppplus.viewpager_20211204

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.viewpager_20211204.adpater.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mvpe : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
        setValues()

    }

    fun setupEvents(){


    }

    fun setValues(){

        mvpe = MainViewPagerAdapter( supportFragmentManager )
        mainViewPager.adapter = mvpe

    }
}