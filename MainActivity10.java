package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity10 extends AppCompatActivity {
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        t1 = (TextView) findViewById(R.id.t1);
        t1.setText("DATABASE MANAGEMENT SYSTEM\n "+ "\n"+"Database Management System is an organized collection of interrelated data that helps in accessing data quickly, along with efficient insertion, and deletion of data into the DBMS. DBMS organizes data in the form of tables, schemas, records, etc. \n" +
                "\n" +
                "DBMS over File System\n" +
                "\n" +
                "The file system has numerous issues, which were resolved with the help of DBMS, the issues with the file system are:\n" +
                "\n" +
                "1.Data Redundancy: \nSame data can be stored at multiple places.It refers to the duplication of data within a database or information system. It occurs when the same piece of data is stored in multiple places.  \n\n" +
                "2.Data Inconsistency: \nIf multiple copies of the same data have different content in each copy. Like, the phone number of students is different in academic and accounts files. \n\n" +
                "3.Data access: \nIn a file system, accessing data was difficult and insecure as well. Accessing data concurrently was not possible.\n\n" +
                "4.No Backup and Recovery: \nThere is no backup and recovery in the file system that can lead to data loss.It is essential components to safeguard the integrity and availability of data. Backup strategies include full backups, which capture the entire database, incremental backups that focus on changes since the last backup, and differential backups that store modifications since the last full backup.\n");
    }
}