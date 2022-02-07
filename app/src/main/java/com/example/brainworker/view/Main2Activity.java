package com.example.brainworker.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.brainworker.R;

public class Main2Activity extends AppCompatActivity {
    private Button mCharButton;
    private Button mBCButton;
    private Button mHelp;
    private Button mRaid;
    private Button mAkasha;
    private Button mBeg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        mCharButton = (Button) findViewById(R.id.characters_button);
        mBCButton = (Button) findViewById(R.id.bc_button);
        mHelp = (Button) findViewById(R.id.parameters);
        mRaid = (Button) findViewById(R.id.raid_button);
        mAkasha = (Button) findViewById(R.id.akashic_menu);
        mBeg = (Button) findViewById(R.id.story_button);



        mCharButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // User clicked the button
                Intent gameActivityIntent = new Intent(Main2Activity.this, Characters.class);
                startActivity(gameActivityIntent);
            }
        });
        mBCButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // User clicked the button
                Intent gameActivityIntent = new Intent(Main2Activity.this, BroochsCalcActivity.class);
                startActivity(gameActivityIntent);
            }
        });
        mHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // User clicked the button
                Intent gameActivityIntent = new Intent(Main2Activity.this, HelpActivity.class);
                startActivity(gameActivityIntent);
            }
        });
        mRaid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // User clicked the button
                Intent gameActivityIntent = new Intent(Main2Activity.this, RaidActivity.class);
                startActivity(gameActivityIntent);
            }
        });
        mAkasha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // User clicked the button
                Intent gameActivityIntent = new Intent(Main2Activity.this, AkashicActivity.class);
                startActivity(gameActivityIntent);
            }
        });
        mBeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // User clicked the button
                Intent gameActivityIntent = new Intent(Main2Activity.this, BeginnerActivity.class);
                startActivity(gameActivityIntent);
            }
        });

    }
}
