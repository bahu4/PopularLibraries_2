package com.example.popularlibraries_2.hw2.second;

import android.util.Log;

import com.example.popularlibraries_2.Constants;

import java.util.ArrayList;

public class Spam implements Observable, Constants {

    private ArrayList<Observer> arrayList;
    private String msg;

    public Spam() {
        arrayList = new ArrayList<>();
    }

    public void newSpam(String msg) {
        this.msg = msg;
        notifyAllObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        arrayList.add(observer);
        Log.d(TAG, "registerObserver: observer № " + arrayList.size() + " " + Thread.currentThread().getName());
    }

    @Override
    public void unregisterObserver(Observer observer) {
        arrayList.remove(observer);
        Log.d(TAG, "unregisterObserver: observer № " + (arrayList.size() + 1) + " " + Thread.currentThread().getName());
    }

    @Override
    public void notifyAllObservers() {
        Log.d(TAG, "notifyAllObservers: " + Thread.currentThread().getName());
        for (int i = 0; i < arrayList.size(); i++) {
            Observer observer = arrayList.get(i);
            observer.updateData(msg);
        }
    }
}
