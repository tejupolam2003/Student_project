package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity7 extends AppCompatActivity {
    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        b1 = (Button) findViewById(R.id.p1);
        b2 = (Button) findViewById(R.id.p2);
        b3 = (Button) findViewById(R.id.p3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jo = new Intent(getApplicationContext(), MainActivity16.class);
                startActivity(jo);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent jt = new Intent(getApplicationContext(), MainActivity17.class);
                startActivity(jt);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent jtt = new Intent(getApplicationContext(), MainActivity18.class);
                startActivity(jtt);
            }
        });
    }
}