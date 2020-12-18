package com.example.myapplication;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {
    private int horsepower;

    public DieselEngineModule(int horsepower) {
        this.horsepower = horsepower;
    }

    @Provides
    int provideHorsepower() {
        return horsepower;
    }
    @Provides
    Engine provideEngine(DieselEngine dieselEngine) {
        return dieselEngine;
    }
}
