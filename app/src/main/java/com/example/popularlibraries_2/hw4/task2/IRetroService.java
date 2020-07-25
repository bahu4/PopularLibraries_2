package com.example.popularlibraries_2.hw4.task2;

import com.example.popularlibraries_2.hw4.task1.JsonClass;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface IRetroService {
    @GET("/users/{name}")
    Observable<JsonClass> getUser(@Path("name") String user);
}