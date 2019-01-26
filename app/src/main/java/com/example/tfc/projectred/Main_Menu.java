package com.example.tfc.projectred;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Main_Menu extends AppCompatActivity {

    public ImageButton abt_na,help,contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        abt_na  = (ImageButton)findViewById(R.id.intro);
        help    = (ImageButton)findViewById(R.id.help);
        contact = (ImageButton)findViewById(R.id.contact);

        abt_na.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main_Menu.this,About_Na.class));
            }
        });

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main_Menu.this,FAQ.class));
            }
        });

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main_Menu.this,Contact_Us.class));
            }
        });

    }
}
