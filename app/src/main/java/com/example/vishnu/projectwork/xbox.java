package com.example.vishnu.projectwork;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class xbox extends AppCompatActivity {
    Button next,purchase2,details, previous, purchase,map;
    ViewFlipper ViewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xbox);
        ViewFlipper = (ViewFlipper) findViewById(R.id.viewflipper);
        purchase2 = (Button) findViewById(R.id.button2);
        purchase2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent((xbox.this), splash2.class);
                startActivity(i);
            }
        });
        details = (Button) findViewById(R.id.button4);
        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent((xbox.this), moredetailed.class);
                startActivity(i);
            }
        });
        purchase = (Button) findViewById(R.id.purchase);
        purchase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent((xbox.this), splash1.class);
                startActivity(i);
            }
        });
        {
        next = (Button) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                if (V == next) {
                    ViewFlipper.showNext();
                }


                    previous = (Button) findViewById(R.id.previous);
                    previous.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View V) {
                            if (V == previous) {
                                ViewFlipper.showPrevious();
                            }
                            map = (Button) findViewById(R.id.button2);
                            map.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent i = new Intent((xbox.this), MapsActivity.class);
                                    startActivity(i);

                                }
                            });
                        }


                        });

                }
            });

    }}}




