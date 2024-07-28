package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog;
import android.database.sqlite.SQLiteDatabase;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText e1,e2;
    Button b;
    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        e1 = (EditText) findViewById(R.id.ed1);
        e2 = (EditText) findViewById(R.id.ed2);
        b = (Button) findViewById(R.id.ll);
        db = openOrCreateDatabase("ELearnDB", Context.MODE_PRIVATE, null);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = e1.getText().toString();
                String pass = e2.getText().toString();
                Cursor c = db.rawQuery("SELECT * FROM da WHERE name='" + e1.getText() + "'", null);
                if (c.moveToFirst()) {
                    if (pass.equalsIgnoreCase(c.getString(1))) {
                        Intent ii = new Intent(getApplicationContext(), MainActivity4.class);
                        ii.putExtra("val1", name);
                        startActivity(ii);
                    } else {
                        showMessage("Login Failed", "Enter valid Password");
                        clearText();
                    }
                } else {
                    showMessage("Login Failed", "Enter correct Username");
                    clearText();
                }
            }

        });
    }
    public void showMessage(String title,String message)
    {
        AlertDialog.Builder b=new AlertDialog.Builder(this);
        b.setCancelable(true);
        b.setTitle(title);
        b.setMessage(message);
        b.show();
    }
    private void clearText()
    {
        e1.setText("");
        e2.setText("");
    }

}