package com.bbit3b.avrajsingh.appone;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView fName_E = (TextView) findViewById(R.id.fName);
        TextView lName_E = (TextView) findViewById(R.id.lName);
        TextView phone_E = (TextView) findViewById(R.id.phone);
        TextView email_E = (TextView) findViewById(R.id.email);
        Intent intent = getIntent();
        String fName = intent.getStringExtra("fName");
        String lName = intent.getStringExtra("lName");
        String phone = intent.getStringExtra("phone");
        String email = intent.getStringExtra("email");

        fName_E.setText(fName);
        lName_E.setText(lName);
        phone_E.setText(phone);
        email_E.setText(email);

    }

}
