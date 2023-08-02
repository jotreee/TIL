package com.example.project10_3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class CalculateActivity extends Activity {
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        int n1 = intent.getIntExtra("n1", 0);
        int n2 = intent.getIntExtra("n2", 0);
        String s = intent.getStringExtra("s");
//
        int[] result = new int[1];
        switch (s) {
            case "plus":
                result[0] = n1 + n2;
                break;
            case "minus":
                result[0] = n1 - n2;
                break;
            case "multiple":
                result[0] = n1 * n2;
                break;
            case "divide":
                result[0] = n1 / n2;
                break;
        }
//
        Intent resultIntent = new Intent(getApplicationContext(), MainActivity.class);
        resultIntent.putExtra("result", result[0]);
        setResult(RESULT_OK, resultIntent);
        finish();
    }

}
