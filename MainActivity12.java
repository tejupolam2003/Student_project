package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity12 extends AppCompatActivity {
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
        t1 = (TextView) findViewById(R.id.tv3);
        t1.setText("Concurrency Control in DBMS\nConcurrently control is a very important concept of DBMS which ensures the simultaneous execution or manipulation of data by several processes or user without resulting in data inconsistency. Concurrency Control deals with interleaved execution of more than one transaction.\n\nWhat is Transaction? \n" +
                "A set of logically related operations is known as a transaction.\n The main operations of a transaction are:" +
                "\n" +
                "Read(A): Read operations Read(A) or R(A) reads the value of A from the database and stores it in a buffer in the main memory.\n" +
                "Write (A): Write operation Write(A) or W(A) writes the value back to the database from the buffer. \n\nProperties of a Transaction:\n" +
                "Atomicity: \nAs a transaction is a set of logically related operations, either all of them should be executed or none." +
                "\n" +
                "Consistency: \nIf operations of debit and credit transactions on the same account are executed concurrently, it may leave the database in an inconsistent state.\n\nConcurrency Control in DBMS:\n" +
                "Executing a single transaction at a time will increase the waiting time of the other transactions which may result in delay in the overall execution. Hence for increasing the overall throughput and efficiency of the system, several transactions are executed.\n" +
                "Concurrently control is a very important concept of DBMS which ensures the simultaneous execution or manipulation of data by several processes or user without resulting in data inconsistency.\n" );
    }
}