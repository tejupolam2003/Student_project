package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity6 extends AppCompatActivity {
    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        b1 = (Button) findViewById(R.id.j1);
        b2 = (Button) findViewById(R.id.j2);
        b3 = (Button) findViewById(R.id.j3);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jo = new Intent(getApplicationContext(), MainActivity13.class);
                startActivity(jo);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent jt = new Intent(getApplicationContext(), MainActivity14.class);
                startActivity(jt);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent jtt = new Intent(getApplicationContext(), MainActivity15.class);
                startActivity(jtt);
            }
        });
    }
}