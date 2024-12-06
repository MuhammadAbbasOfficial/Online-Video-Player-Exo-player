package com.onlineplayerapp

import android.os.Bundle
import android.widget.VideoView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val videoView: VideoView = findViewById(R.id.videoView)



        // Set the video URL
        val videoUrl = "https://www.devbrackets.com/media/samples/video/big_buck_bunny.mp4" // Video URL
        videoView.setVideoPath(videoUrl)

        // Start the video
        videoView.setOnPreparedListener {
            videoView.start()
        }



    }
}