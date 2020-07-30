package com.example.popularlibraries_2.hw6.task2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.popularlibraries_2.R;

public class DiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_di);
    }

    public void getDiLogs(View view) {
        Green green = new Green();
        Red red = new Red(green);
        White white = new White(green);
    }
}