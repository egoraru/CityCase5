package ru.egora.citycase

import android.annotation.TargetApi
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader

class PiActivity : AppCompatActivity() {

    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pi)
        val webView = findViewById<WebView>(R.id.webView)
        webView.webViewClient = MyWebViewClient()
        // включаем поддержку JavaScript
        webView.settings.javaScriptEnabled = true


        // указываем страницу загрузки
        webView.loadUrl("https://egora.ru/g/sprav.html") }


        private class MyWebViewClient : WebViewClient() {


            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                return if (url.startsWith("tel:")) {
                    view.context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
                    true
                } else if (url.contains("mailto:")) {
                    view.context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
                    true
                } else if (url.contains("geo:")) {
                    view.context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
                    true
                } else if (url.contains("http:")) {
                    view.context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
                    true
                } else {
                    view.loadUrl(url)
                    true
                }
            }



        }

        override fun onBackPressed()
        {
            if (webView.canGoBack())
            {
                webView.goBack()
            }
                else {
                        super.onBackPressed()
                     }

        }





}