package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {
    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        b1 = (Button) findViewById(R.id.u1);
        b2 = (Button) findViewById(R.id.u2);
        b3 = (Button) findViewById(R.id.u3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mo = new Intent(getApplicationContext(), MainActivity10.class);
                startActivity(mo);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mt = new Intent(getApplicationContext(), MainActivity11.class);
                startActivity(mt);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mth = new Intent(getApplicationContext(), MainActivity12.class);
                startActivity(mth);
            }
        });
    }
}