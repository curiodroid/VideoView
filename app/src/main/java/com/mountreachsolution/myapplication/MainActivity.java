package com.mountreachsolution.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = findViewById(R.id.vvEducationVideo);
        String videoPath = "android.resource://"+getPackageName()
                +"/raw/tatavideo";

        videoView.setVideoPath(videoPath);
        videoView.start();

        MediaController mediaController = new MediaController(MainActivity.this);
        videoView.setMediaController(mediaController);

    }
}