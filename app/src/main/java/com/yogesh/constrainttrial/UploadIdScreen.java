package com.yogesh.constrainttrial;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class UploadIdScreen extends AppCompatActivity implements View.OnClickListener{

    Button upload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.upload_id_screen);

        upload=findViewById(R.id.upload_id);
        upload.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(UploadIdScreen.this,Register.class));
    }
}
