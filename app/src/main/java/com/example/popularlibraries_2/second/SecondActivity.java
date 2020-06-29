package com.example.popularlibraries_2.second;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.popularlibraries_2.R;

public class SecondActivity extends AppCompatActivity {

    Button add;
    Button delete;
    Button spamBtn;

    Spam spam = new Spam();
    Iam iam = new Iam();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        initField();
        onClick();
    }

    private void onClick() {
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spam.registerObserver(iam);
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spam.unregisterObserver(iam);
            }
        });
        spamBtn.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spam.newSpam("Hello World!");
            }
        }));
    }

    private void initField() {
        add = findViewById(R.id.addBtn);
        delete = findViewById(R.id.deleteBtn);
        spamBtn = findViewById(R.id.spamBtn);
    }
}