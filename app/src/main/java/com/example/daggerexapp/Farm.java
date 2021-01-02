package com.example.daggerexapp;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

@Activity
public class Farm {
    private static final String TAG = "Farm";

    @Inject
    public Farm() {
        Log.d(TAG, "ahmed Farm: from field ");
    }

    public String getBeans(){
        return "Beans";
    }
}
