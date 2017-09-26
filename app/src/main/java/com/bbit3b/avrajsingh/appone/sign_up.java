package com.bbit3b.avrajsingh.appone;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class sign_up extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final EditText txt_firstname = (EditText) findViewById(R.id.firstname);
        final EditText txt_lastname = (EditText) findViewById(R.id.lastname);
        final EditText txt_phone = (EditText) findViewById(R.id.phone);
        final EditText txt_email = (EditText) findViewById(R.id.email);
        EditText txt_password = (EditText) findViewById(R.id.password);
        Button btn_create_account = (Button) findViewById(R.id.create_account);

        btn_create_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home_page_intent = new Intent(sign_up.this, home.class);
                home_page_intent.putExtra("fName", txt_firstname.getText().toString());
                home_page_intent.putExtra("lName", txt_lastname.getText().toString());
                home_page_intent.putExtra("phone", txt_phone.getText().toString());
                home_page_intent.putExtra("email", txt_email.getText().toString());
                startActivity(home_page_intent);
            }
        });
    }

}
