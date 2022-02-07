package com.example.brainworker.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.brainworker.R;
import com.example.brainworker.view.characterlist.ChiiActivity;
import com.example.brainworker.view.characterlist.ErwinActivity;
import com.example.brainworker.view.characterlist.HaruActivity;
import com.example.brainworker.view.characterlist.IrisActivity;
import com.example.brainworker.view.characterlist.JinActivity;
import com.example.brainworker.view.characterlist.LilyActivity;
import com.example.brainworker.view.characterlist.StellaActivity;

public class Characters extends AppCompatActivity {

    private Button mHaruButton;
    private Button mLilyButton;
    private Button mStellaButton;
    private Button mErwinButton;
    private Button mJinButton;
    private Button mIrisButton;
    private Button mChiiButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_characters);

        mHaruButton = (Button) findViewById(R.id.haru_button);
        mLilyButton = (Button) findViewById(R.id.lily_button);
        mStellaButton = (Button) findViewById(R.id.stella_button);
        mErwinButton = (Button) findViewById(R.id.erwin_button);
        mJinButton = (Button) findViewById(R.id.jin_button);
        mIrisButton = (Button) findViewById(R.id.iris_button);
        mChiiButton = (Button) findViewById(R.id.chii_button);



        mHaruButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // User clicked the button
                Intent haruActivityIntent = new Intent(Characters.this, HaruActivity.class);
                startActivity(haruActivityIntent);
            }
        });
        mLilyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // User clicked the button
                Intent lilyActivityIntent = new Intent(Characters.this, LilyActivity.class);
                startActivity(lilyActivityIntent);
            }
        });
        mStellaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // User clicked the button
                Intent stellaActivityIntent = new Intent(Characters.this, StellaActivity.class);
                startActivity(stellaActivityIntent);
            }
        });
        mErwinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // User clicked the button
                Intent erwinActivityIntent = new Intent(Characters.this, ErwinActivity.class);
                startActivity(erwinActivityIntent);
            }
        });
        mJinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // User clicked the button
                Intent jinActivityIntent = new Intent(Characters.this, JinActivity.class);
                startActivity(jinActivityIntent);
            }
        });
        mIrisButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // User clicked the button
                Intent irisActivityIntent = new Intent(Characters.this, IrisActivity.class);
                startActivity(irisActivityIntent);
            }
        });
        mChiiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // User clicked the button
                Intent  chiiActivityIntent = new Intent(Characters.this, ChiiActivity.class);
                startActivity(chiiActivityIntent);
            }
        });

    }
}
