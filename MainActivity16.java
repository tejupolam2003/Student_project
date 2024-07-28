package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity16 extends AppCompatActivity {
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);
        t1 = (TextView) findViewById(R.id.tv7);
        t1.setText("COMPUTER NETWORKS\n"+"\n"+"Computer Networking is the practice of connecting computers together to enable communication and data exchange between them. In general, Computer Network is a collection of two or more computers. It helps users to communicate more easily. In this article, we are going to discuss the basics which everyone must know before going deep into Computer Networking.\n\n Basic Terminologies of Computer Networks:\n" +
                "1.Network:\n A network is a collection of computers and devices that are connected together to enable communication and data exchange.\n" +
                "2.Nodes: \nNodes are devices that are connected to a network. These can include computers, Servers, Printers, Routers, Switches, and other devices.\n" +
                "3.Protocol: \nA protocol is a set of rules and standards that govern how data is transmitted over a network. Examples of protocols include TCP/IP, HTTP, and FTP.\n" +
                "4.Topology: \nNetwork topology refers to the physical and logical arrangement of nodes on a network. The common network topologies include bus, star, ring, mesh, and tree.\n" +
                "5.Service Provider Networks:\n These types of Networks give permission to take Network Capacity and Functionality on lease from the Provider. Service Provider Networks include Wireless Communications, Data Carriers, etc.\n" +
                "6.IP Address:\n An IP address is a unique numerical identifier that is assigned to every device on a network.");
    }
}