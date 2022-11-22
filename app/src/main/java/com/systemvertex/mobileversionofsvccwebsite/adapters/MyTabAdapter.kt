@file:Suppress("DEPRECATION")

package com.systemvertex.mobileversionofsvccwebsite.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.systemvertex.mobileversionofsvccwebsite.fragments.AboutFragment
import com.systemvertex.mobileversionofsvccwebsite.fragments.CareerFragment
import com.systemvertex.mobileversionofsvccwebsite.fragments.ContactFragment

@Suppress("DEPRECATION")
internal class MyTabAdapter(var context: Context,
                            fm: FragmentManager,
                            var totalTabs: Int):
    FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return totalTabs
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                AboutFragment()
            }
            1 -> {
                ContactFragment()
            }
            2 -> {
                CareerFragment()
            }
            else -> getItem(position)
        }
    }
}