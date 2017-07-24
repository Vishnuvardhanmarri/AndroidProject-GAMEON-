package com.example.vishnu.projectwork;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by vishn on 4/18/2017.
 */

public class screen extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen);
        new Handler().postDelayed(new Runnable() {
            //A Handler allows you to send and process Message and Runnable objects associated with a thread
            // Each Handler instance is associated with a single thread and that thread's message queue
            //When you create a new Handler, it is bound to the thread of the thread that is creating it --
            // from that point on, it will deliver messages and runnables to that message queue and execute them as they come out of the message queue.
            @Override
            public void run() {
                Intent i = new Intent(screen.this, tabs.class);
                startActivity(i);
                finish();
            }
        },SPLASH_TIME_OUT);
        }
    }

