package com.systemvertex.mobileversionofsvccwebsite.fragments

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import androidx.fragment.app.Fragment
import com.systemvertex.mobileversionofsvccwebsite.R

class CareerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_career, container, false)

        val webView = view.findViewById<WebView>(R.id.webview_career)
        webView.loadUrl("https://www.svcc.com.my/career")

        val webSettings = webView.settings
        webSettings.javaScriptEnabled

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            webView.webViewClient
        }

        // Inflate the layout for this fragment
        return view
    }

}