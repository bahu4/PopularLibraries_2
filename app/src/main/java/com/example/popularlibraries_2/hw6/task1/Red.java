package com.example.popularlibraries_2.hw6.task1;

import android.util.Log;

import com.example.popularlibraries_2.Constants;

public class Red implements Constants {
    Green green = new Green();

    public Red() {
        Log.e(TAG, "Red " + green.getColor());
    }
}
