package com.example.project4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView1, textView2;
    Switch check;
    RadioGroup radio;
    RadioButton dog, cat, rabbit;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);
        check = (Switch) findViewById(R.id.check);
        radio = (RadioGroup) findViewById(R.id.radio);
        dog = (RadioButton) findViewById(R.id.dog);
        cat = (RadioButton) findViewById(R.id.cat);
        rabbit = (RadioButton) findViewById(R.id.rabbit);
        image = (ImageView) findViewById(R.id.image);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (check.isChecked()) {
                    textView2.setVisibility(android.view.View.VISIBLE);
                    radio.setVisibility(android.view.View.VISIBLE);
                    image.setVisibility(android.view.View.VISIBLE);
                } else {
                    textView2.setVisibility(android.view.View.INVISIBLE);
                    radio.setVisibility(android.view.View.INVISIBLE);
                    image.setVisibility(android.view.View.INVISIBLE);
                }
            }
        });

        dog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.dog);
            }
        });

        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.cat);
            }
        });

        rabbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.rabbit);
            }
        });
    }
}