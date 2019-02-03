package com.example.tfc.projectred;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class New_FAQ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_faq);

        ExpandableListView expandableListView = findViewById(R.id.expandableListView);

        HashMap<String, List<String>> item = new HashMap<>();

        ArrayList<String> linuxGroups = new ArrayList<>();
        linuxGroups.add(
                "Salt is composed of two minerals sodium (Na) and chloride (Cl). Table salt (NaCl) contains about 40% sodium and 60% chloride. " +
                "One teaspoon of salt contains about 2,300 mg of sodium. As much as we are told to limit sodium in our diets, we all need some sodium for good health." +
                " However, the average American diet contains about three times more sodium than is healthy," +
                " which leads to high blood pressure and other health issues.");


        item.put("Difference between Sodium(Na) and Salt(NaCl) ? ", linuxGroups);

        ArrayList<String> windowsGroups = new ArrayList<>();
        windowsGroups.add
                ("Na is a neutral form of the sodium atom. " +
                "Na+ on the other hand has a positive charge of 1." +
                " This + means that the atom has lost 1 electron," +
                " making it's charge more positive that it was before. " +
                "This can also be read as Na needing one more (+1) atom in order to become neutral once again.");



        item.put("What is Na+? ", windowsGroups);


        ExpandableListAdapterrr adapter = new ExpandableListAdapterrr(item);
        expandableListView.setAdapter(adapter);



    }
}
