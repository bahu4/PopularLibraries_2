package com.example.popularlibraries_2.hw6.task1;

import android.util.Log;

import com.example.popularlibraries_2.Constants;

public class White implements Constants {
    Green green = new Green();

    public White() {
        Log.d(TAG, "White " + green.getColor());
    }
}
