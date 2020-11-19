package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = ((TextView) findViewById(R.id.textNameLabel));

        //change the text color of the label: Hello from x!
        findViewById(R.id.textColorButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.textNameLabel))
                        .setTextColor(getResources().getColor(R.color.dark_bluegreen_set));
            }
        });

        //change the text color of the background of the app
        findViewById(R.id.bgColorButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((RelativeLayout)findViewById(R.id.parent))
                        .setBackgroundColor(getResources().getColor(R.color.pale_bluegreen_set));
            }
        });

        //change the text label
        findViewById(R.id.changeTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.textNameLabel))
                        .setText("Android is awesome!");
            }
        });

        //enter custom text label
        findViewById(R.id.changeCustomTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userText = ((EditText)findViewById(R.id.createCustomText))
                        .getText().toString();
                if (userText.isEmpty()){
                    textView.setText("Display your own text here!");
                }
                else{
                    textView.setText(userText);
                }
            }
        });

        //restore all settings to default
        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Hello from Melissa!");
               textView.setTextColor(getResources().getColor(R.color.orange_set));
                ((RelativeLayout)findViewById(R.id.parent))
                        .setBackgroundColor(getResources().getColor(R.color.medium_bluegreen_set));
            }
        });
    }
}