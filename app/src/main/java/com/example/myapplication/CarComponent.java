package com.example.myapplication;

import dagger.Component;

@Component (modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {
//    Car getCar();

    void inject(MainActivity mainActivity);
}
