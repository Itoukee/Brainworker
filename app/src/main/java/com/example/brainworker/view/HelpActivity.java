package com.example.brainworker.view;

import android.graphics.Color;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.brainworker.R;

public class HelpActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        setupHyperlink();


 }
    private void setupHyperlink() {
        TextView linkTextView = findViewById(R.id.activity_help_link);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());

    }
}
