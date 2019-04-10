package com.yogesh.constrainttrial;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LoginScreen extends AppCompatActivity implements View.OnClickListener {
    Button generateotp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);

        generateotp=findViewById(R.id.btn_generate_otp);

        generateotp.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

            startActivity(new Intent(LoginScreen.this,OtpScreen.class));
         }

    }

