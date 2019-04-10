package com.yogesh.constrainttrial;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class OtpScreen extends AppCompatActivity implements View.OnClickListener {

    Button verifyotp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.otp_screen);

        verifyotp=findViewById(R.id.verify_otp);
        verifyotp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(OtpScreen.this,UploadIdScreen.class));
    }
}
