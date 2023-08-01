package com.example.project5_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1, num2;
    Button plus, minus, multiple, divide;
    TextView result;
    Button[] numButtons = new Button[10];
    Integer[] numBtnIDs = { R.id.btn0, R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9 };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        multiple = (Button) findViewById(R.id.multiple);
        divide = (Button) findViewById(R.id.divide);
        result = (TextView) findViewById(R.id.result);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                int r = n1 + n2;
                result.setText("계산 결과: " + r.toString());
            }
        });

        for(int i = 0; i < 10; i++) {
            numButtons[i] = (Button) findViewById(numBtnIDs[i]);
        }

        for(int i = 0; i < 10; i++) {
            
        }
    }
}