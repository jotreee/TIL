package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText num1, num2;
    Button plus, minus, multiple, divide, spare;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        result = (TextView) findViewById(R.id.result);

        plus = (Button) findViewById(R.id.plus);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = num1.getText().toString();
                String str2 = num2.getText().toString();
                if (str1.isEmpty() | str2.isEmpty()) {
                    Toast.makeText(getApplicationContext(),"값이 입력되지 않음", Toast.LENGTH_SHORT).show();
                }
                else {
                    result.setText(String.valueOf(Integer.parseInt(str1) + Integer.parseInt(str2)));
                }
            }
        });

        minus = (Button) findViewById(R.id.minus);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = num1.getText().toString();
                String str2 = num2.getText().toString();
                if (str1.isEmpty() | str2.isEmpty()) {
                    Toast.makeText(getApplicationContext(),"값이 입력되지 않음", Toast.LENGTH_SHORT).show();
                }
                else {
                    result.setText(String.valueOf(Integer.parseInt(str1) - Integer.parseInt(str2)));
                }
            }
        });

        multiple = (Button) findViewById(R.id.multiple);
        multiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = num1.getText().toString();
                String str2 = num2.getText().toString();
                if (str1.isEmpty() | str2.isEmpty()) {
                    Toast.makeText(getApplicationContext(),"값이 입력되지 않음", Toast.LENGTH_SHORT).show();
                }
                else {
                    result.setText(String.valueOf(Integer.parseInt(str1) * Integer.parseInt(str2)));
                }
            }
        });

        divide = (Button) findViewById(R.id.divide);
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = num1.getText().toString();
                String str2 = num2.getText().toString();
                if (str1.isEmpty() | str2.isEmpty()) {
                    Toast.makeText(getApplicationContext(),"값이 입력되지 않음", Toast.LENGTH_SHORT).show();
                } else if (Integer.parseInt(str2) == 0) {
                    Toast.makeText(getApplicationContext(), "0으로 나눌 수 없음", Toast.LENGTH_SHORT).show();
                } else {
                    result.setText(String.valueOf(Integer.parseInt(str1) / Integer.parseInt(str2)));
                }
            }
        });

        spare = (Button) findViewById(R.id.spare);
        spare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = num1.getText().toString();
                String str2 = num2.getText().toString();
                if (str1.isEmpty() | str2.isEmpty()) {
                    Toast.makeText(getApplicationContext(),"값이 입력되지 않음", Toast.LENGTH_SHORT).show();
                } else if (Integer.parseInt(str2) == 0) {
                    Toast.makeText(getApplicationContext(), "0으로 나눌 수 없음", Toast.LENGTH_SHORT).show();
                } else {
                    result.setText(String.valueOf(Integer.parseInt(str1) % Integer.parseInt(str2)));
                }
            }
        });
    }
}