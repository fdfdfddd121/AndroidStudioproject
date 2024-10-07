package com.App.androidstudioproj;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Main extends AppCompatActivity {
    TextView textView;
    Button namebutton;
    Button phonebutton;;
    Button emailbutton;
    Button redbutton;;
    Button greenbutton;
    Button bluebutton;
    EditText name;
    EditText phone;
    EditText email;
    EditText red;
    EditText green;
    EditText blue;
    int color;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView) findViewById(R.id.text_id);
        namebutton=(Button) findViewById(R.id.namebutton);
        phonebutton=(Button) findViewById(R.id.phonebutton);
        emailbutton=(Button) findViewById(R.id.emailbutton);
        redbutton=(Button) findViewById(R.id.redbutton);
        greenbutton=(Button) findViewById(R.id.greenbutton);
        bluebutton=(Button) findViewById(R.id.bluebutton);
        name=(EditText) findViewById(R.id.nametext);
        phone=(EditText) findViewById(R.id.phonetext);
        email=(EditText) findViewById(R.id.emailtext);
        red=(EditText) findViewById(R.id.redtext);
        green=(EditText) findViewById(R.id.greentext);
        blue=(EditText) findViewById(R.id.bluetext);
        
        color = textView.getCurrentTextColor();


        namebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(name.getText().toString());
            }
        });
        phonebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(phone.getText().toString());
            }
        });
        emailbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(email.getText().toString());
            }
        });
        redbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int newColor = Color.argb(Color.alpha(color), Integer.parseInt(red.getText().toString()), Color.green(color), Color.blue(color));
                color = newColor;
                textView.setTextColor(newColor);
            }
        });
        greenbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int newColor = Color.argb(Color.alpha(color), Color.red(color), Integer.parseInt(green.getText().toString()), Color.blue(color));
                color = newColor;
                textView.setTextColor(newColor);
            }
        });
        bluebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int newColor = Color.argb(Color.alpha(color), Color.red(color), Color.green(color), Integer.parseInt(blue.getText().toString()));
                color = newColor;
                textView.setTextColor(newColor);
            }
        });

    }
}