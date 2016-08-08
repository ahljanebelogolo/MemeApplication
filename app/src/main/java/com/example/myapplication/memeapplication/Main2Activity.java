package com.example.myapplication.memeapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    Button button;
    TextView textView;
    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = (TextView) findViewById(R.id.topView);
        textView2 = (TextView) findViewById(R.id.buttomView);

        Intent intent = getIntent();

        String upper = intent.getStringExtra("upper");
        String bottom  = intent.getStringExtra("bottom");

        textView.setText( upper + " " );
        textView2.setText( bottom + " " );


    }


}