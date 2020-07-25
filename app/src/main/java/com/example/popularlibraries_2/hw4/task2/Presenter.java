package com.example.popularlibraries_2.hw4.task2;

import android.util.Log;
import android.widget.ImageView;

import com.example.popularlibraries_2.Constants;
import com.example.popularlibraries_2.hw4.task1.JsonClass;
import com.squareup.picasso.Picasso;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;

public class Presenter implements Constants {
    RetroApi retroApi;

    public Presenter() {
        retroApi = new RetroApi();
    }

    public void getAvatar(ImageView view) {
        Observable<JsonClass> observable = retroApi.request();
        Disposable disposable = observable.observeOn(AndroidSchedulers.mainThread()).subscribe(jsonClass -> {
            Picasso
                    .get()
                    .load(jsonClass.avatar_url)
                    .into(view);
        }, throwable -> {
            Log.e(TAG, "onError");
        });
    }
}
