package com.example.project10_3;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);

        final String[] s = new String[1];
        RadioButton btn[] = new RadioButton[4];
        String btnName[] = { "plus", "minus", "multiple", "divide" };
        Integer btnId[] = { R.id.plus, R.id.minus, R.id.multiple, R.id.divide };
        for (int i = 0; i < 4; i++) {
            final int idx;
            idx = i;
            btn[idx] = (RadioButton) findViewById(btnId[idx]);
            btn[idx].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    s[0] = btnName[idx];
                }
            });
        }

        Button calculate = (Button) findViewById(R.id.calculate);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CalculateActivity.class);
                intent.putExtra("n1", Integer.parseInt(num1.getText().toString()));
                intent.putExtra("n2", Integer.parseInt(num2.getText().toString()));
                intent.putExtra("s", s[0]);
                startActivityResult.launch(intent);
            }
        });
    }

    ActivityResultLauncher<Intent> startActivityResult = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == RESULT_OK) {
                        Intent resultIntent = result.getData();
                        Toast.makeText(getApplicationContext(), "합계 : " + resultIntent.getIntExtra("result", 0), Toast.LENGTH_LONG).show();
                    }
                }
            });
}