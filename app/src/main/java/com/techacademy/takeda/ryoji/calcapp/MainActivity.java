package com.techacademy.takeda.ryoji.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editText1;
    EditText editText2;
    Button plus;
    Button minus;
    Button multiply;
    Button divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.divide);

        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        multiply.setOnClickListener(this);
        divide.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        double num1 = Double.parseDouble(editText1.getText().toString());
        double num2 = Double.parseDouble(editText2.getText().toString());

        Intent intent = new Intent(this, Main2Activity.class);

        if (id == R.id.plus) {
            intent.putExtra("result", num1 + num2);
        } else if (id == R.id.minus) {
            intent.putExtra("result", num1 - num2);
        } else if (id == R.id.multiply) {
            intent.putExtra("result", num1 * num2);
        } else if (id == R.id.divide) {
            intent.putExtra("result", num1 / num2);
        }

        startActivity(intent);
    }
}
