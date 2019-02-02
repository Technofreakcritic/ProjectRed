package com.example.tfc.projectred;

import android.Manifest;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import static android.net.MailTo.parse;

public class B2_Contact_Us extends AppCompatActivity {

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


        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFB("373560576236");
            }
        });
        tw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTW("KKMPutrajaya");
            }
        });
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                call("0380008000");
            }
        });
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email("kkm@moh.gov.my");
            }
        });
        }


    private void openFB(String id ){
        try{
            Intent open = new Intent(Intent.ACTION_VIEW,Uri.parse("fb://page/"+ id));
            startActivity(open);
        }
        catch(ActivityNotFoundException e){
            Intent open = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/"+ id));
            startActivity(open);
        }
    }
    private void openTW (String username ){
        try{
            Intent open = new Intent(Intent.ACTION_VIEW,Uri.parse("twitter://user?screen_name"+ username));
            startActivity(open);
        }
        catch(ActivityNotFoundException e){
            Intent open = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.twitter.com/"+ username));
            startActivity(open);
        }
    }
    private void call(String id ){
        Intent call = new Intent (Intent.ACTION_DIAL);
        call.setData(Uri.parse("tel:"+id));
        startActivity(call);
    }
    private void email (String id){

                Intent send = new Intent(Intent.ACTION_SENDTO);
                String uriText = "mailto:" + Uri.encode(id)+"?subject="+Uri.encode("Enquiry")+ "&body="+Uri.encode("Enquiry");
                Uri uri = Uri.parse(uriText);
                send.setData(uri);
                startActivity(Intent.createChooser(send,"Send mail"));
            }



    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
    }
}
