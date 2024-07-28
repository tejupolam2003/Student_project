package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity8 extends AppCompatActivity {
    SQLiteDatabase db;
    String name, num;
    TextView t1, t2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        t1 = (TextView) findViewById(R.id.tb1);
        t2 = (TextView) findViewById(R.id.tb2);
        b1 = (Button) findViewById(R.id.button3);
        db = openOrCreateDatabase("ELearnDB", Context.MODE_PRIVATE, null);
        Bundle extras = getIntent().getExtras();
        name = extras.getString("val3");
        Cursor c = db.rawQuery("SELECT * FROM ma WHERE name='" + name + "'", null);
        if (c.moveToFirst()) {
            num = c.getString(1);
        }
        t1.setText(name);
        t2.setText(num);
    }

    public void logout(View view) {
        Intent ff = new Intent(this, MainActivity2.class);
        startActivity(ff);
    }

    public void showMessage(String title, String message) {
        AlertDialog.Builder b = new AlertDialog.Builder(this);
        b.setCancelable(true);
        b.setTitle(title);
        b.setMessage(message);
        b.show();
    }
}