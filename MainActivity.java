package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button l;
    Button r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l = (Button)findViewById(R.id.login);
        r = (Button) findViewById(R.id.register);
    }
    public void log(View view)
    {
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
    }
    public void reg(View view)
    {
        Intent in = new Intent(this, MainActivity3.class);
        //Intent in = new Intent(this, MainActivity4.class);
        startActivity(in);
    }
}