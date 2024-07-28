package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity15 extends AppCompatActivity {
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);
        t1 = (TextView) findViewById(R.id.tv6);
        t1.setText("PROCESS MANAGEMENT IN OS\n\n" +
                "A Program does nothing unless its instructions are executed by a CPU. A program in execution is called a process. In order to accomplish its task, process needs the computer resources." +
                "\n" +
                "There may exist more than one process in the system which may require the same resource at the same time. Therefore, the operating system has to manage all the processes and the resources in a convenient and efficient way." +
                "\n" +
                "Some resources may need to be executed by one process at one time to maintain the consistency otherwise the system can become inconsistent and deadlock may occur." +
                "\n\n" +
                "The operating system is responsible for the following activities in connection with Process Management:" +
                "\n"+
                "1.Scheduling processes and threads on the CPUs.\n" +
                "2.Creating and deleting both user and system processes.\n" +
                "3.Suspending and resuming processes.\n" +
                "4.Providing mechanisms for process synchronization.\n" +
                "5.Providing mechanisms for process communication.Attributes of a process\n\n" +
                "Attributes which are stored in the PCB are described below:\n" +
                "\n" +
                "1. Process ID\n" +
                "When a process is created, a unique id is assigned to the process which is used for unique identification of the process in the system.\n" +
                "\n" +
                "2. Program counter\n" +
                "A program counter stores the address of the last instruction of the process on which the process was suspended. The CPU uses this address when the execution of this process is resumed.\n" +
                "\n");
    }
}