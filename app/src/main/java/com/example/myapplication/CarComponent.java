package com.example.myapplication;

import dagger.Component;

@Component
public interface CarComponent {
//    Car getCar();

    void inject(MainActivity mainActivity);
}
