package com.example.mad_practical_7_21012011129

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton

class YoutubeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)

        val Change : FloatingActionButton = findViewById(R.id.floatingActionButton2)
//        val webSettings: WebSettings = binding.youtubeWebView.settings webSettings.javaScriptEnabled = true
//        webSettings.LoadWithOverviewMode = true
//        webSettings.useWideViewPort = true
//        binding.youtubeWebView.loadUrl("https://www.youtube.com/embed/SyoutubeId")
//

        val webSettings : WebSettings = 

        Change.setOnClickListener {
            Intent(this@YoutubeActivity,MainActivity::class.java).also { startActivity(it) }
        }
    }
}