package ru.egora.citycase

import android.annotation.TargetApi
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient

class AfActivity : AppCompatActivity() {

    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ru.egora.citycase.R.layout.activity_af)
        val webView = findViewById<WebView>(ru.egora.citycase.R.id.webView)
        webView.webViewClient = ru.egora.citycase.AfActivity.MyWebViewClient()
        // включаем поддержку JavaScript
        webView.settings.javaScriptEnabled = true
        // указываем страницу загрузки
        webView.loadUrl("https://egora.ru/g/kal.html") }

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