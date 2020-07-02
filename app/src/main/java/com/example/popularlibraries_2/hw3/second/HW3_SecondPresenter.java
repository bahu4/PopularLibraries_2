package com.example.popularlibraries_2.hw3.second;

import android.util.Log;

import com.example.popularlibraries_2.Constants;

import io.reactivex.Single;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.schedulers.Schedulers;

public class HW3_SecondPresenter implements Constants {
    public Single<String> getMsg() {
        Single<String> single = Single.create((SingleOnSubscribe<String>) emitter -> {
            String hello = "Hello World!";
            emitter.onSuccess(hello);
            Log.d(TAG,"onSuccess " + Thread.currentThread().getName());
        }).subscribeOn(Schedulers.io());
        return single;
    }
}
