package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity13 extends AppCompatActivity {
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
        t1 = (TextView) findViewById(R.id.tv4);
        t1.setText("OPERATING SYSTEMS:\n\nAn Operating System can be defined as an interface between user and hardware. It is responsible for the execution of all the processes, Resource Allocation, CPU management, File Management and many other tasks.\n" +

                "The purpose of an operating system is to provide an environment in which a user can execute programs in convenient and efficient manner.\nFunctions of the Operating System\n" +
                "1.Resource Management: \nThe operating system manages and allocates memory, CPU time, and other hardware resources among the various programs and processes running on the computer.\n" +
                "2.Process Management: \nThe operating system is responsible for starting, stopping, and managing processes and programs. It also controls the scheduling of processes and allocates resources to them.\n" +
                "3.Memory Management: \nThe operating system manages the computer’s primary memory and provides mechanisms for optimizing memory usage.\n" +
                "4.Security: \nThe operating system provides a secure environment for the user, applications, and data by implementing security policies and mechanisms such as access controls and encryption.\n" +
                "5.Job Accounting: \nIt keeps track of time and resources used by various jobs or users.\n" +
                "6.File Management:\n The operating system is responsible for organizing and managing the file system, including the creation, deletion, and manipulation of files and directories.\n" +
                "7.Device Management: \nThe operating system manages input/output devices such as printers, keyboards, mice, and displays. It provides the necessary drivers and interfaces to enable communication between the devices and the computer.\n");
    }
}