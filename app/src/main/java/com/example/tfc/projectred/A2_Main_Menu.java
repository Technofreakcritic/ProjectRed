package com.example.tfc.projectred;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class A2_Main_Menu extends AppCompatActivity {

    public ImageButton abt_na,help,contact;
    public ImageButton smartna;

    public Button Nec_sod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        abt_na  = (ImageButton)findViewById(R.id.intro);
        help    = (ImageButton)findViewById(R.id.help);
        contact = (ImageButton)findViewById(R.id.contact);
        smartna = (ImageButton)findViewById(R.id.smartna_plus);

        Nec_sod = (Button) findViewById(R.id.nec_sod);


        abt_na.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(A2_Main_Menu.this,B1_About_Na.class));
            }
        });

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(A2_Main_Menu.this,B7_FAQ.class));
            }
        });

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(A2_Main_Menu.this,B2_Contact_Us.class));
            }
        });

        smartna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(A2_Main_Menu.this,B3_SmartNa_plus.class));
            }
        });

        Nec_sod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(A2_Main_Menu.this,B4_Necessary_Sodium.class));
            }
        });

    }
}
