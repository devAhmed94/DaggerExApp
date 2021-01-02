package com.example.daggerexapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Inject
    Coffee coffee ,coffee2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppComponent appComponent = ((MainApplication) getApplication()).getAppComponent();
        ComponentInterface componentInterface = appComponent.getComponentInterface().milk(10).sugar(20).build();

        componentInterface.inject(this);

        Log.d("aly", "\n coffee.river "+coffee.river
                +"\n coffee2.river " +coffee2.river
                +"\n coffee "+coffee
                +"\n coffee2 "+coffee2);

    }
}