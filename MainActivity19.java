package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.database.Cursor;
import android.content.Context;

public class MainActivity19 extends AppCompatActivity {
    EditText ed1;
    RadioGroup rg1,rg2;
    Button b1;
    SQLiteDatabase db;
    String name;
    int s = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main19);
        ed1 = (EditText) findViewById(R.id.edit1);
        rg1 = (RadioGroup) findViewById(R.id.g1);
        rg2 = (RadioGroup) findViewById(R.id.g2);
        b1 = (Button) findViewById(R.id.button2);
        db = openOrCreateDatabase("ELearnDB", Context.MODE_PRIVATE,null);
        Bundle extras = getIntent().getExtras();
        name = extras.getString("val2");
        db.execSQL("CREATE TABLE IF NOT EXISTS ma(name varchar,marks varchar);");
        db.execSQL("INSERT INTO ma VALUES('" + name + "','" + "" + "');");
    }
    public void go(View view) {
        int a1 = rg1.getCheckedRadioButtonId();
        int a2 = rg2.getCheckedRadioButtonId();
        RadioButton r1 = (RadioButton) findViewById(a1);
        RadioButton r2 = (RadioButton) findViewById(a2);
        String a = ed1.getText().toString();
        String b = r1.getText().toString();
        String c = r2.getText().toString();
//        int s= 0;
        String ss1 = "Oreo";
        String ss2 = "False";
        String ss3 = "Oracle";
        if(a.compareTo(ss1)==0)
        {
            s=s+10;
        }
        if(b.compareTo(ss2)==0)
        {
            s=s+10;
        }
        if(c.compareTo(ss3)==0)
        {
            s=s+10;
        }
        showMessage("SCORE",""+s+"/30");
        String n = String.valueOf(s);
        Cursor c1 = db.rawQuery("SELECT * FROM da WHERE name='"+name+"'",null);
        if(c1.moveToFirst())
        {
            db .execSQL("UPDATE ma SET marks='" + s +"' WHERE name='"+name+"';");
        }
        else
        {
            db.execSQL("INSERT INTO ma VALUES('" + name + "','" + "" + "');");
        }

    }
    public void showMessage(String title,String message)
    {
        AlertDialog.Builder b=new AlertDialog.Builder(this);
        b.setCancelable(true);
        b.setTitle(title);
        b.setMessage(message);
        b.show();
    }
}