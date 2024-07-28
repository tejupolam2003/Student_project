package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity14 extends AppCompatActivity {
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);
        t1 = (TextView) findViewById(R.id.tv5);
        t1.setText("TYPES OF OPERATING SYSTEMS\n\n1.Batch Operating System: \nA Batch Operating System is a type of operating system that does not interact with the computer directly. There is an operator who takes similar jobs having the same requirements and groups them into batches.\n" +
                "2.Time-sharing Operating System:\n Time-sharing Operating System is a type of operating system that allows many users to share computer resources (maximum utilization of the resources).\n" +
                "3.Distributed Operating System: \nDistributed Operating System is a type of operating system that manages a group of different computers and makes appear to be a single computer. These operating systems are designed to operate on a network of computers. They allow multiple users to access shared resources and communicate with each other over the network. Examples include Microsoft Windows Server and various distributions of Linux designed for servers.\n" +
                "4.Network Operating System:\n Network Operating System is a type of operating system that runs on a server and provides the capability to manage data, users, groups, security, applications, and other networking functions.\n" +
                "5.Real-time Operating System:\n Real-time Operating System is a type of operating system that serves a real-time system and the time interval required to process and respond to inputs is very small. \n" +
                "6.Multiprocessing Operating System: \nMultiprocessor Operating Systems are used in operating systems to boost the performance of multiple CPUs within a single computer system. Multiple CPUs are linked together so that a job can be divided and executed more quickly.\n" );
    }
}