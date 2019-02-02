package com.example.tfc.projectred;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FoodList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);

    // Setting up Recyclerview with adapter

        RecyclerView recyclerView = findViewById(R.id.rv_list);
        List<item> mlist = new ArrayList<>();

        Adapter2 adapter2 = new Adapter2(this,mlist);
        recyclerView.setAdapter(adapter2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        mlist.add(new item(R.drawable.burgers,"Burgers",8));
        mlist.add(new item(R.drawable.burgers,"Rice",2));
        mlist.add(new item(R.drawable.burgers,"Cookies",1));
        mlist.add(new item(R.drawable.burgers,"Pizza",5));
        mlist.add(new item(R.drawable.burgers," Fried Chicken",3));



    }
}
