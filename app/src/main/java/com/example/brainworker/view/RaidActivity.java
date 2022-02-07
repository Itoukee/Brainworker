package com.example.brainworker.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.brainworker.R;
import com.example.brainworker.view.bosses.AovActivity;
import com.example.brainworker.view.bosses.HHActivity;
import com.example.brainworker.view.bosses.PrimalActivity;

public class RaidActivity extends AppCompatActivity {
    private Button mHH;
    private Button mAov;
    private Button mPrimal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raid);

        mHH = (Button) findViewById(R.id.hh_button);
        mAov = (Button) findViewById(R.id.aov_button);
        mPrimal = (Button) findViewById(R.id.primal_button);

        mHH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // User clicked the button
                Intent gameActivityIntent = new Intent(RaidActivity.this, HHActivity.class);
                startActivity(gameActivityIntent);
            }
        });
        mAov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // User clicked the button
                Intent gameActivityIntent = new Intent(RaidActivity.this, AovActivity.class);
                startActivity(gameActivityIntent);
            }
        });
        mPrimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // User clicked the button
                Intent gameActivityIntent = new Intent(RaidActivity.this, PrimalActivity.class);
                startActivity(gameActivityIntent);
            }
        });

    }
}
