package com.example.popularlibraries_2.hw6.task3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.popularlibraries_2.R;

import javax.inject.Inject;

public class DaggerActivity extends AppCompatActivity {
    @Inject
    Green green;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger);
    }

    public void getDaggerLogs(View view) {
        Red red = new Red();
        White white = new White();
    }
}