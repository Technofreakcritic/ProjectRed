package com.example.tfc.projectred;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class Contact_Us extends AppCompatActivity {

    private ImageButton phone,email;
    private ImageButton fb,tw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact__us);

        // Connect button to design
        phone = (ImageButton) findViewById(R.id.phone_img);
        email = (ImageButton) findViewById(R.id.mail_img);
        fb = (ImageButton) findViewById(R.id.facebook);
        tw = (ImageButton) findViewById(R.id.twiiter);

        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = "0380008000";
                Uri a =(Uri.parse("tel:"+num));

                Intent call = new Intent(Intent.ACTION_CALL,a);

                if (ActivityCompat.checkSelfPermission(Contact_Us.this,Manifest.permission.CALL_PHONE)!=
                        PackageManager.PERMISSION_GRANTED)
                {return;}
                startActivity(call);
            }
        });

    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
    }
}
