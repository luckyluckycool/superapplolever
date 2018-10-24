package com.example.user.superapplolever;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView text3;
    Button b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String result = String.valueOf(getIntent().getDoubleExtra("myname", 0.0));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
         text3= findViewById(R.id.text3);
        b4 = findViewById(R.id.b4);
        text3.setText(result);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(ResultActivity.this, MainActivity.class);
                startActivity(intent2);


            }
        });

    }
}
