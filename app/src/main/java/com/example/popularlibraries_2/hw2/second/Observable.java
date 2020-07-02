package com.example.popularlibraries_2.hw2.second;

public interface Observable {
    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyAllObservers();
}
