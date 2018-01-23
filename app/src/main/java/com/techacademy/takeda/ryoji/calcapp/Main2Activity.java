package com.techacademy.takeda.ryoji.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        double result = intent.getDoubleExtra("result", 0);

        TextView textView = (TextView) findViewById(R.id.result);
        textView.setText(String.valueOf(result));
    }
}
