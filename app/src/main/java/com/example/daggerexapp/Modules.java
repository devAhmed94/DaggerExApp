package com.example.daggerexapp;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class Modules {
    @Singleton
    @Provides
    public River providerRiver(){
        return new River();
    }


}
