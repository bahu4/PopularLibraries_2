package com.example.popularlibraries_2.second;

import android.util.Log;

import com.example.popularlibraries_2.Constants;

public class Iam implements Observer, Constants {
    @Override
    public void updateData(String msg) {
        Log.d(TAG, "updateData: " + Thread.currentThread().getName() + " " + msg);
    }
}
