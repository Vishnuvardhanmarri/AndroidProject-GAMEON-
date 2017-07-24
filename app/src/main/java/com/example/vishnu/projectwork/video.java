package com.example.vishnu.projectwork;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;


public class video extends YouTubeBaseActivity {


    YouTubePlayerView youTubePlayerView;
    Button button;
    YouTubePlayer.OnInitializedListener onInitializedListener;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video);
        button =(Button) findViewById(R.id.btn);
        youTubePlayerView=(YouTubePlayerView)findViewById(R.id.youtubeplayerview);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            //This class provides the API for managing Wi-Fi peer-to-peer connectivity
            //This lets an application discover available peers, setup connection to peers and query for the list of peers.
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("yhEIw0Fz4Eg");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }


        };
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                youTubePlayerView.initialize(youtubeplayer.API_KEY,onInitializedListener);
            }
        });

    }


}
