package com.example.tfc.projectred;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class B7_FAQ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);

        ExpandableListView expandableListView = findViewById(R.id.Explistview);

        HashMap<String,List<String>> item = new HashMap<>();

        ArrayList<String> Q1A = new ArrayList<>();
        Q1A.add("Coffee is power");

        item.put("Coffee Question",Q1A);

        ArrayList<String> Q2A = new ArrayList<>();
        Q2A.add("What garbage is tea");

        item.put("TEA TRASH",Q2A);

        MyExpandableListAdapter adapter = new MyExpandableListAdapter(item);
        expandableListView.setAdapter(adapter);


    }
}
