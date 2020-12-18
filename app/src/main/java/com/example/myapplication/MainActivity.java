package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

//    private Car car;
    @Inject Car car1, car2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        CarComponent component = DaggerCarComponent.create();
//        car = component.getCar();

        CarComponent component = DaggerCarComponent.builder()
                .horsePower(100)
                .engineCapacity(150)
                .build();
//                .dieselEngineModule(new DieselEngineModule(100)).build();

        component.inject(this);
        car1.drive();
        car2.drive();
    }
}