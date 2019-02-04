package com.example.tfc.projectred;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class FoodListNew extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodlistnew);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        RecyclerView recyclerView = findViewById(R.id.rv_listnew);
        List<itemnew> mList = new ArrayList<>();
        mList.add(new itemnew(R.drawable.dinner,"Egg n Beef ",R.drawable.dinner,2500));
        mList.add(new itemnew(R.drawable.breakfast,"Pancake Set",R.drawable.breakfast,4000));
        mList.add(new itemnew(R.drawable.recipe_group,"Thosai",R.drawable.email_ad,1200));
        mList.add(new itemnew(R.drawable.recipe_group_1,"Baked cookies",R.drawable.email_ad,3200));
        mList.add(new itemnew(R.drawable.recipe_group_2,"Burgers & Grills",R.drawable.email_ad,3300));
        mList.add(new itemnew(R.drawable.coffee_cakes,"White Coffee & Cake",R.drawable.email_ad,3400));
        mList.add(new itemnew(R.drawable.tomatos,"Tomato Soup",R.drawable.email_ad,3400));
        mList.add(new itemnew(R.drawable.sodas,"Soda ",R.drawable.sodas,3000));


        Adapternew adapternew = new Adapternew(this,mList);
        recyclerView.setAdapter(adapternew);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));




    }
}
