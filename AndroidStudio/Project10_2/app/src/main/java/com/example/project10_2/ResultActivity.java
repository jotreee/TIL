package com.example.project10_2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RatingBar;

public class ResultActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        Intent intent = getIntent();
        int[] voteResult = intent.getIntArrayExtra("VoteCount");

        RatingBar star[] = new RatingBar[9];
        Integer starId[] = { R.id.r1, R.id.r2, R.id.r3, R.id.r4, R.id.r5, R.id.r6, R.id.r7, R.id.r8, R.id.r9 };

        for (int i = 0; i < 9; i++) {
            star[i] = (RatingBar) findViewById(starId[i]);
            star[i].setRating((float) voteResult[i]);
        }
    }
}
