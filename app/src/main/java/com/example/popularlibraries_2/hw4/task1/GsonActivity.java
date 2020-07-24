package com.example.popularlibraries_2.hw4.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.popularlibraries_2.Constants;
import com.example.popularlibraries_2.R;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonActivity extends AppCompatActivity implements Constants {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gson);

        Button btn = findViewById(R.id.logBtn);

        String json = " {\"time_of_year\": \"summer\", \"year\": 2019}";

        Gson gson = new GsonBuilder().create();
        JsonClass jClass = gson.fromJson(json, JsonClass.class);

        btn.setOnClickListener(v -> {
            Log.d(TAG, jClass.time_of_year);
            Log.d(TAG, jClass.year);
        });

    }
}