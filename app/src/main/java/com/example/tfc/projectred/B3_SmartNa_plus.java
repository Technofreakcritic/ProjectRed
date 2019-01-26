package com.example.tfc.projectred;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;

public class B3_SmartNa_plus extends AppCompatActivity {

    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smart_na_plus);

        mainGrid = (GridLayout)findViewById(R.id.Mgrid);

        openPage(mainGrid);
    }

    private void openPage(GridLayout mainGrid){
        for(int i=0;i<mainGrid.getChildCount();i++)
        {
            CardView cardView =(CardView)mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch(finalI){
                        case 1 :
                            Intent open = new Intent(B3_SmartNa_plus.this,B1_About_Na.class);
                            startActivity(open);
                        case 2 :
                            Intent a = new Intent(B3_SmartNa_plus.this,A1_Splash_Screen.class);
                            startActivity(a);
                        case 3 :
                            Intent b = new Intent(B3_SmartNa_plus.this,B2_Contact_Us.class);
                            startActivity(b);

                        default :;
                    }
                }
            });

        }
    }

}
