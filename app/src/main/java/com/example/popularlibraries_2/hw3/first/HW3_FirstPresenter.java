package com.example.popularlibraries_2.hw3.first;

import android.util.Log;

import com.example.popularlibraries_2.Constants;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.schedulers.Schedulers;

public class HW3_FirstPresenter implements Constants {
    public Observable<String> getMessage() {
        Observable<String> observable = Observable.create((ObservableOnSubscribe<String>) emitter -> {
            try {
                for (int i = 0; i < 10; i++) {
                    TimeUnit.SECONDS.sleep(1);
                    emitter.onNext("Message № " + i);
                    Log.d(TAG, "getMessage: " + Thread.currentThread().getName());
                }
            } catch (InterruptedException e) {
                Log.e(TAG, "InterruptedException");
            }
        }).subscribeOn(Schedulers.io());
        return observable;
    }
}
