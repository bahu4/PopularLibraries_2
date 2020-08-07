package com.example.popularlibraries_2.hw6.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.popularlibraries_2.R;

public class NoDiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_di);

    }

    public void getNoDiLogs(View view) {
        Red red = new Red();
        White white = new White();
    }
}