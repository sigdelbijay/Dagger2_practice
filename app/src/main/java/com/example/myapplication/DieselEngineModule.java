package com.example.myapplication;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine bindEngine(DieselEngine engine);
}
