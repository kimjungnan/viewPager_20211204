package com.neppplus.viewpager_20211204.adpater

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.neppplus.viewpager_20211204.fragment.AddressFragment
import com.neppplus.viewpager_20211204.fragment.AgeFragment
import com.neppplus.viewpager_20211204.fragment.NameFragment

class MainViewPagerAdapter( fm : FragmentManager ) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {

        return when (position){
            0 -> "이름"
            1 -> "거주지"
            else -> "나이"

        }

    }


//    함수의 결과를 곧바로 3으로도 리턴 가능
//    override fun getCount() = 3
    override fun getCount(): Int {
        return 3
//        TODO("Not yet implemented")
    }

    override fun getItem(position: Int): Fragment {

        return when (position){
            0 -> NameFragment()
            1 -> AddressFragment()
            else -> AgeFragment()
        }


//        TODO("Not yet implemented")
    }


}