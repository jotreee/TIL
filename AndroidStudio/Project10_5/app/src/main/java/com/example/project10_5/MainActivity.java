package com.example.project10_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("test", "onCreate()");

        Button dial = findViewById(R.id.dial);
        dial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                startActivity(intent);
            }
        });

        Button finish = findViewById(R.id.finish);
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("test", "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("test", "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("test", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("test", "onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("test", "onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("test", "onDestroy()");
    }
}