package com.example.daggerexapp;

import android.util.Log;

import javax.inject.Inject;

public class River {
    private static final String TAG = "River";

    public River() {
        Log.d(TAG, " ahmed River: from constructor ");
    }
    public String getWater(){
        return "water";
    }
}
