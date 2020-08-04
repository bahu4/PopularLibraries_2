package com.example.popularlibraries_2.hw5;

import android.util.Log;

import com.example.popularlibraries_2.Constants;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class RoomPresenter implements Constants {
    private UsersDao usersDao;

    public RoomPresenter() {
        usersDao = App.getAppDatabase().usersDao();
    }

    public void putData() {
        Users users = new Users();
        users.name = "Ivan";
        users.surname = "Ivanov";
        users.age = 1;

        Disposable disposable = usersDao.insert(users).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(id -> {
                    Log.d(TAG, "put " + id);
                }, throwable -> {
                    Log.e(TAG, "put " + throwable);
                });
    }

    public void getData() {
        Disposable disposable = usersDao.getAll().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(users -> {
                    Log.d(TAG, "get " + users);
                }, throwable -> {
                    Log.e(TAG, "get " + throwable);
                });
    }

}
