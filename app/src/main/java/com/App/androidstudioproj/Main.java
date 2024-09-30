package com.App.androidstudioproj;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Main extends AppCompatActivity {
    TextView textView;
    Button button;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView) findViewById(R.id.text_id);
        button=(Button) findViewById(R.id.button_id);
        button.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            @Override
            public void onClick(View v) {
                count++;
                if(count%2==1) {
                    textView.setText("you changed me");
                }
                else {
                    textView.setText("some random title");
                }
            }
        });
    }
}