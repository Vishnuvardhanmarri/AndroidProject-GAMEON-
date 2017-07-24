package com.example.vishnu.projectwork;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class platforms extends AppCompatActivity {
    ListView listView;
    Button xbox;
    ArrayAdapter<String> adapter;
    String[] myapp =

            {"Xbox","PlayStation", "OtherAccesories", "GameCds" };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.platforms);
        xbox = (Button) findViewById(R.id.video);
        xbox.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void  onClick(View v) {
                Intent i = new Intent((platforms.this), video.class);
                startActivity(i);
            }
        });


        listView = (ListView)findViewById(R.id.listview5);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,myapp);
        //ArrayAdapter uses a TextView to display each item which is present inside it. but it also uses  the toString() method of each object that it holds
        // and displays this inside  the TextView. ArrayAdapter has a number of constructors that can be used and
        // arrayAdapter  converts an ArrayList of objects into View items loaded into the ListView container.
        listView.setAdapter(adapter);
        //Sets the adapter that provides the data and the views to represent the data in this widget.
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                switch(position) {
                    case 0:
                        intent = new Intent(platforms.this, xbox.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(platforms.this, playstation.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(platforms.this, otheraccessories.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(platforms.this, gamecds.class);
                        startActivity(intent);
                        break;

                }
            }

        });

    }
}

