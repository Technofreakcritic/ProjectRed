package com.example.tfc.projectred;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash_Screen extends AppCompatActivity {

    protected boolean active = true;
    final int timer = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);

        // Will have to later add onBackPressed() handler to deal with back Button

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                finish();
                Intent i3 = new Intent(Splash_Screen.this, Contact_Us.class);
                startActivity(i3);
            overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);}
        }, timer);
    }
}

