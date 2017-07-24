package com.example.vishnu.projectwork;

import android.content.Intent;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;


public class xboxwelcome extends AppCompatActivity {
    VideoView vw;
    MediaController mc;
    String Videopath = "android.resource://com.example.vishnu.projectwork/"+R.raw.gaming;

    private static int SPLASH_TIME_OUT = 10000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xboxwelcome);
        vw = (VideoView)findViewById(R.id.videoView);
        mc = new MediaController(this);
        mc.setAnchorView(vw);
        vw.setMediaController(mc);
        vw.setVideoPath(Videopath);
        vw.start();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(xboxwelcome.this, welcome.class);
                startActivity(i);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}