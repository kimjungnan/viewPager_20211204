package com.neppplus.viewpager_20211204.adpater

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.neppplus.viewpager_20211204.fragment.AddressFragment
import com.neppplus.viewpager_20211204.fragment.AgeFragment
import com.neppplus.viewpager_20211204.fragment.NameFragment

class MainViewPagerAdapter( fm : FragmentManager ) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 3
//        TODO("Not yet implemented")
    }

    override fun getItem(position: Int): Fragment {
        if (position == 0){
            return NameFragment()
        } else if (position ==1 ){
            return AddressFragment()
        } else {
            return AgeFragment()
        }

//        TODO("Not yet implemented")
    }


}