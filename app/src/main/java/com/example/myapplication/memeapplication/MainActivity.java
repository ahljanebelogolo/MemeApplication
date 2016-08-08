package com.example.myapplication.memeapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText mEtUpperText;
    private EditText mEtBottomText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();

        mEtUpperText = (EditText) findViewById(R.id.topText);
        mEtBottomText = (EditText) findViewById(R.id.bottomText);


    }

    private void addListenerOnButton() {

        final Context context = this;

        button = (Button) findViewById(R.id.memeButton);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {


                Intent intent = new Intent(context, Main2Activity.class);
                intent.putExtra("upper", mEtUpperText.getText().toString());
                intent.putExtra("bottom", mEtBottomText.getText().toString());
                startActivity(intent);

            }
        });


    }
}

