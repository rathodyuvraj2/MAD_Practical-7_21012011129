package com.example.mad_practical_7_21012011129

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.MediaController
import android.widget.VideoView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myVideoView = findViewById<VideoView>(R.id.videoView)
        val mediaController = MediaController(this)
        val uri : Uri = Uri.parse("android.resource://"+packageName +"/"+R.raw.thestoryoflight)
        myVideoView.setVideoURI(uri)
        myVideoView.requestFocus()
        myVideoView.start()

        val Change : FloatingActionButton = findViewById(R.id.floatingActionButton2)

        Change.setOnClickListener {
            Intent(this@MainActivity,YoutubeActivity::class.java).also { startActivity(it) }
        }
    }

}