package com.example.user.superapplolever;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText editText1;
EditText editText2;
Button plus;
Button minus;
Button mnoj;
Button dil;
double temporary;
HideClass hideClass = new HideClass();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        mnoj = findViewById(R.id.mnoj);
        dil = findViewById(R.id.dil);










        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final double a = Double.valueOf(editText1.getText().toString());
                final double b = Double.valueOf(editText2.getText().toString());
                temporary = hideClass.sum(a,b);
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("myname", temporary);
                startActivity(intent);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final double a = Double.valueOf(editText1.getText().toString());
                final double b = Double.valueOf(editText2.getText().toString());
                 temporary =hideClass.ext(a,b);
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                startActivity(intent);
            }
        });

        mnoj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final double a = Double.valueOf(editText1.getText().toString());
                final double b = Double.valueOf(editText2.getText().toString());
                 temporary = hideClass.mult(a,b);
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                startActivity(intent);
            }
        });

        dil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final double a = Double.valueOf(editText1.getText().toString());
                final double b = Double.valueOf(editText2.getText().toString());
                 temporary =  hideClass.div(a,b);
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                startActivity(intent);
            }
        });
    }
}
