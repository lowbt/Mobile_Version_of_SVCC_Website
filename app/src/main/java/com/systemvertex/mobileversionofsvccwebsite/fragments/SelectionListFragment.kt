package com.systemvertex.mobileversionofsvccwebsite.fragments

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.systemvertex.mobileversionofsvccwebsite.ProductListener
import com.systemvertex.mobileversionofsvccwebsite.R


class SelectionListFragment : Fragment(), View.OnClickListener {

    private lateinit var productListener: ProductListener

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(context is ProductListener) {
            productListener = context
        } else {
            throw RuntimeException("Must implement ProductListener")
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_selection_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val products = listOf<View>(
            view.findViewById(R.id.pan_printer_1),
            view.findViewById(R.id.pan_printer_2),
            view.findViewById(R.id.pan_printer_3),
            view.findViewById(R.id.pan_printer_4),
            view.findViewById(R.id.pan_projector_1),
            view.findViewById(R.id.pan_projector_2),
            view.findViewById(R.id.pan_projector_3),
            view.findViewById(R.id.pan_phone_1),
            view.findViewById(R.id.pan_phone_2),
            view.findViewById(R.id.pan_phone_3),
            view.findViewById(R.id.pan_phone_4),
            view.findViewById(R.id.pan_phone_5)
            )

        products.forEach {
            it.setOnClickListener(this)
        }

    }

    override fun onClick(v: View?) {
        v?.let{ product ->
            productListener.onSelected(product.id)
            v.setBackgroundColor(Color.LTGRAY)
        }
    }

}