package com.systemvertex.mobileversionofsvccwebsite

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.systemvertex.mobileversionofsvccwebsite.fragments.ProductDetailFragment

interface ProductListener {
    fun onSelected(id: Int)
}

class ProductActivity : AppCompatActivity(), ProductListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
    }

    override fun onSelected(id: Int) {
        val productDetailFragment = supportFragmentManager.findFragmentById(R.id.product_detail_fragment) as ProductDetailFragment
        productDetailFragment.setProductData(id)

    }

}