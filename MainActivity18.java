package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity18 extends AppCompatActivity {
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main18);
        tv1 = (TextView) findViewById(R.id.tv9);
        tv1.setText("OSI MODEL\n"+"\n"+"The OSI model, created in 1984 by ISO, is a reference framework that explains the process of transmitting data between computers. It is divided into seven layers that work together to carry out specialised network functions, allowing for a more systematic approach to networking.\n\nThe OSI model consists of seven abstraction layers arranged in a top-down order:" +
                "\n" +
                "1.Physical Layer\n" +
                "2.Data Link Layer\n" +
                "3.Network Layer\n" +
                "4.Transport Layer\n" +
                "5.Session Layer\n" +
                "6.Presentation Layer\n" +
                "7.Application Layer\n"+"\n"+"TCP/IP MODEL\nThe main work of TCP/IP is to transfer the data of a computer from one device to another. The main condition of this process is to make data reliable and accurate so that the receiver will receive the same information which is sent by the sender. To ensure that, each message reaches its final destination accurately, the TCP/IP model divides its data into packets and combines them at the other end, which helps in maintaining the accuracy of the data while transferring from one end to another end.\n"+"\n"+"MEDIA ACCESS CONTROL " +
                "\n" +
                "MAC address is defined as the identification number for the hardware. In general, the network interface cards (NIC) of each computer such as Wi-Fi Card, Bluetooth or Ethernet Card has unchangeable MAC address embedded by the vendor at the time of manufacturing. ");
    }
}