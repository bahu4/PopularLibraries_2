package com.example.popularlibraries_2.hw8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;

import com.example.popularlibraries_2.Constants;
import com.example.popularlibraries_2.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class LeakActivity extends AppCompatActivity implements Constants {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leak);
        Log.d(TAG, "onCreate: " + LeakActivity.this);
        ButterKnife.bind(this);
        memoryLeak();
    }

    @OnClick(R.id.recreateBtn)
    public void reCreateActivity() {
        recreate();
    }

    private void memoryLeak() {
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                for (int i = 0; i < 30; i++) {
                    Log.d(TAG, "doInBackground: " + LeakActivity.this);
                    SystemClock.sleep(1000);
                }
                return null;
            }
        }.execute();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: " + LeakActivity.this);
    }
}