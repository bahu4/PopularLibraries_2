package com.example.popularlibraries_2.hw6.task3;

import android.util.Log;

import com.example.popularlibraries_2.Constants;
import com.example.popularlibraries_2.hw6.task3.app.App;

import javax.inject.Inject;

public class White implements Constants {
    @Inject
    Green green;

    public White() {
        App.getAppComponent().inject(this);
        Log.d(TAG, "White " + green.getColor());
    }
}
