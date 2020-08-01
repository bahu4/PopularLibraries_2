package com.example.popularlibraries_2.hw6.task3.app;

import com.example.popularlibraries_2.hw6.task3.DaggerActivity;
import com.example.popularlibraries_2.hw6.task3.Red;
import com.example.popularlibraries_2.hw6.task3.White;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(DaggerActivity daggerActivity);

    void inject(Red red);

    void inject(White white);
}
