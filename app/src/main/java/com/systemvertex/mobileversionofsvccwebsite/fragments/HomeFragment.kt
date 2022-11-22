package com.systemvertex.mobileversionofsvccwebsite.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.systemvertex.mobileversionofsvccwebsite.R

class HomeFragment : Fragment() {

    private val storeFragment = StoreFragment()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val slide1 = view?.findViewById<ImageView>(R.id.slide_1)

        slide1?.setOnClickListener {

            val transaction = activity?.supportFragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragment_container, storeFragment)
            transaction?.commit()
        }

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

}