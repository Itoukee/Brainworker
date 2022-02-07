package com.example.brainworker.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.brainworker.R;

public class BroochsCalcActivity extends AppCompatActivity {
    private Button mBroochButton;
    private Button mCalcButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broochs_calc);

        mCalcButton = (Button) findViewById(R.id.engrenage);
        mBroochButton = (Button) findViewById(R.id.brooch);



        mBroochButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // User clicked the button
                Intent gameActivityIntent = new Intent(BroochsCalcActivity.this,BroochActivity.class);
                startActivity(gameActivityIntent);
            }
        });
        mCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // User clicked the button
                Intent gameActivityIntent = new Intent(BroochsCalcActivity.this,CalculatorActivity.class);
                startActivity(gameActivityIntent);
            }
        });
    }
}
