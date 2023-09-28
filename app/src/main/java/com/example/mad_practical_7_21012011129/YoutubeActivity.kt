package com.example.mad_practical_7_21012011129

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import com.google.android.material.floatingactionbutton.FloatingActionButton

class YoutubeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)

        val youtubeId = "fJn9B64Znrk"
        val youtubeWebView : WebView = findViewById(R.id.webView)
        val webSettings : WebSettings = youtubeWebView.settings
        webSettings.javaScriptEnabled = true
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true
        youtubeWebView.loadUrl("https://www.youtube.com/embed/$youtubeId")

        val changeButton: FloatingActionButton = findViewById(R.id.floatingActionButton2)



        changeButton.setOnClickListener {
            val intent = Intent(this@YoutubeActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
