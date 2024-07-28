package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity11 extends AppCompatActivity {
    TextView t1;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        t1 = (TextView) findViewById(R.id.tv2);
        t1.setText("NORMALISATION of DBMS\n"+"Normalization is the process of minimizing redundancy from a relation or set of relations. Redundancy in relation may cause insertion, deletion, and update anomalies. So, it helps to minimize the redundancy in relations.\n" +
                "\n" +
                "In database management systems (DBMS), normal forms are a series of guidelines that help to ensure that the design of a database is efficient, organized, and free from data anomalies.\n" +
                "\n" +
                "Important Points Regarding Normal Forms in DBMS:\n\n" +
                "First Normal Form (1NF):\n This is the most basic level of normalization. In 1NF, each table cell should contain only a single value, and each column should have a unique name.\n" +
                "Second Normal Form (2NF):\n 2NF eliminates redundant data by requiring that each non-key attribute be dependent on the primary key. \n" +
                "Third Normal Form (3NF): \n3NF builds on 2NF by requiring that all non-key attributes are independent of each other. This means that each column should be directly related to the primary key, and not to any other columns in the same table.\n" +
                "Boyce-Codd Normal Form (BCNF): \nBCNF is a stricter form of 3NF that ensures that each determinant in a table is a candidate key. In other words, BCNF ensures that each non-key attribute is dependent only on the candidate key.\n" +
                "Fourth Normal Form (4NF):\n 4NF is a further refinement of BCNF that ensures that a table does not contain any multi-valued dependencies.\n" +
                "Fifth Normal Form (5NF):\n 5NF is the highest level of normalization and involves decomposing a table into smaller tables to remove data redundancy and improve data integrity.\n" +
                "\n");
    }
}