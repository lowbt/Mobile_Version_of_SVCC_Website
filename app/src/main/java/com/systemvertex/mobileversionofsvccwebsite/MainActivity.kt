package com.systemvertex.mobileversionofsvccwebsite

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.systemvertex.mobileversionofsvccwebsite.fragments.HomeFragment
import com.systemvertex.mobileversionofsvccwebsite.fragments.ProductFragment
import com.systemvertex.mobileversionofsvccwebsite.fragments.StoreFragment

class MainActivity : AppCompatActivity() {

    private val homeFragment = HomeFragment()
    private val productFragment = ProductFragment()
    private val storeFragment = StoreFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        replaceFragment(homeFragment)

        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottomNavigation.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.ic_home -> replaceFragment(homeFragment)
                R.id.ic_product -> startProductActivity()
                R.id.ic_store -> replaceFragment(storeFragment)
                R.id.ic_about -> startAboutActivity()
            }
            true
        }

    }

    private fun startProductActivity() {
        val intent = Intent(this, ProductActivity::class.java)
        startActivity(intent)
    }

    private fun startAboutActivity(){
        val intent = Intent(this, AboutActivity::class.java)
        startActivity(intent)
    }

    private fun replaceFragment(fragment: Fragment) {
        if (fragment != null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()
        }
    }

    fun RetriveShopeeUrlThroughIntent(view: View) {
        val url = "https://shopee.com.my/jessielee88"
        launchIntent(url)
    }

    fun RetriveLelongUrlThroughIntent(view: View) {
        val url = "http://www.lelong.com.my/store/svccsales85"
        launchIntent(url)
    }

    fun RetriveLazadaUrlThroughIntent(view: View) {
        val url = "https://www.lazada.com.my/shop/svcc-estore/"
        launchIntent(url)
    }

    private fun launchIntent(url: String){
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }

    fun launchStoreFragment(view: View) {
        replaceFragment(storeFragment)
    }

}