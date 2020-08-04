package com.example.popularlibraries_2.hw4.task2;

import com.example.popularlibraries_2.hw4.task1.JsonClass;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroApi {
    public Observable<JsonClass> request() {
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        GsonConverterFactory gsonConverterFactory = GsonConverterFactory.create(gson);
        IRetroService service = new Retrofit.Builder()
                .baseUrl("https://api.github.com")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(gsonConverterFactory)
                .build()
                .create(IRetroService.class);
        return service.getUser("JakeWharton").subscribeOn(Schedulers.io());
    }
}