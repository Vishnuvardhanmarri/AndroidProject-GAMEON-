package com.example.vishnu.projectwork;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class welcome extends AppCompatActivity {
    Button proceed;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);



        proceed = (Button) findViewById(R.id.bproceed);
        proceed.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void  onClick(View v) {
                Intent i = new Intent((welcome.this), platforms.class);
                startActivity(i);
            }
        });
    }
}

