package ru.egora.citycase

import android.annotation.TargetApi
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient

class UsActivity : AppCompatActivity() {

    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_us)
        val webView = findViewById<WebView>(R.id.webView)
        webView.webViewClient = MyWebViewClient()
        // включаем поддержку JavaScript
        webView.settings.javaScriptEnabled = true
        // указываем страницу загрузки
        webView.loadUrl("https://egora.ru/g/us.html") }

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

    override fun onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }

}