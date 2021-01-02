package com.example.daggerexapp;

import android.util.Log;

import javax.inject.Inject;

@Activity
public class Coffee {
    private static final String TAG = "Coffee";
    @Inject
    public Farm farm;
    public River river;
    public int sugar;
    public int milk;

    @Inject
    public Coffee(River river, @Sugar int sugar,@Milk int milk) {
        this.river = river;
        this.sugar = sugar;
        this.milk = milk;
    }

    public String getCoffeeMethod() {
        return farm.getBeans() + "+" + river.getWater()+" sugar :"+ sugar +" milk :"+milk;
    }

    @Inject
    public void getString(){
        Log.d(TAG, "ahmed getString:  from method");
    }
}
