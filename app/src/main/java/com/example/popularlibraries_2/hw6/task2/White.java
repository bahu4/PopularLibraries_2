package com.example.popularlibraries_2.hw6.task2;

import android.util.Log;

import com.example.popularlibraries_2.Constants;

public class White implements Constants {
    public White(Green green) {
        Log.d(TAG, "White " + green.getColor());
    }
}
