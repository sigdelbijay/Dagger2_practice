package com.example.myapplication;
//let a 3rd party dependency

import android.util.Log;

public class Tyres {
    private static final String TAG = "Car";
    public Tyres () {
    }

    public void inflate() {
        Log.d(TAG, "typres inflated");
    }
}
