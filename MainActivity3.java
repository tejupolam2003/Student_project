package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog;
import android.database.sqlite.SQLiteDatabase;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    Button rr ;
    EditText n,p,rp;
    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        rr = (Button) findViewById(R.id.regis);
        n = (EditText) findViewById(R.id.name);
        p = (EditText) findViewById(R.id.pass);
        rp = (EditText) findViewById(R.id.repass);
        db = openOrCreateDatabase("ELearnDB", Context.MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS da(name varchar,password varchar);");
        rr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = n.getText().toString();
                String passw = p.getText().toString();
                String repassw = rp.getText().toString();
                if (name.length() == 0 || passw.length() == 0 || repassw.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Please Enter Valid Details", Toast.LENGTH_LONG).show();
                    return;
                }
                if (passw.equalsIgnoreCase(repassw) == false) {
                    Toast.makeText(getApplicationContext(), "Password is not matching", Toast.LENGTH_LONG).show();
                    return;
                }
                db.execSQL("INSERT INTO da VALUES('" + n.getText() + "','" + p.getText() + "');");
                showMessage("REGISTERED", "SUCCESSFULLY REGISTERED");
                clearText();
//                Intent ii = new Intent(getApplicationContext(), MainActivity19.class);
//                ii.putExtra("v1", (CharSequence) n);

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
        n.setText("");
        p.setText("");
    }
    public void goBack(View view)
    {
        Intent inte = new Intent(this, MainActivity2.class);
        startActivity(inte);
    }
}