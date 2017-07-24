package com.example.vishnu.projectwork;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cod extends AppCompatActivity {
    Button finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cod);
        //setContentView() is used to display content for your Activity UI.Set the activity content to an explicit view.
        // This view is placed directly into the activity's view hierarchy.
        // It can itself be a complex view hierarchy.
        // When calling this method, the layout parameters of the specified view are ignored
        finish = (Button)findViewById(R.id.finish);

        //This command saerches for the views under the given id and returns reference to a view with requested viewId.
        // View is already created and exists. If you do not call findViewById for some view nothing changes.
        //Views are inflated by LayoutInflator. When you call setContentView xml layout is passed and view hierarchy is created.

                finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(cod.this,screen.class);
                startActivity(i);
            }
        });

    }
}
