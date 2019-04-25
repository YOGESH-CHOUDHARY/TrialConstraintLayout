package com.yogesh.constrainttrial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NeverEndingPractice extends AppCompatActivity implements View.OnClickListener {

    Button practice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_never_ending_practice);

        practice=findViewById(R.id.btn_practice);

        practice.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

       startActivity(new Intent(NeverEndingPractice.this,FragmentMainActivity.class));

    }
}
