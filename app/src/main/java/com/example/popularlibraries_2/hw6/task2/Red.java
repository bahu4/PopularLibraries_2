package com.example.popularlibraries_2.hw6.task2;

import android.util.Log;

import com.example.popularlibraries_2.Constants;

public class Red implements Constants {
    public Red(Green green) {
        Log.e(TAG, "Red " + green.getColor());
    }
}
