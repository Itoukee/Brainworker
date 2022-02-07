package com.example.brainworker.view;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.brainworker.R;
import android.content.Intent;
import android.os.Handler;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private final int SPLASH_TIMEOUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
                finish();

            }
        };
        new Handler().postDelayed(runnable,SPLASH_TIMEOUT);


    }
}