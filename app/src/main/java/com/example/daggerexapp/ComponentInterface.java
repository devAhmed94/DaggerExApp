package com.example.daggerexapp;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@Activity
@Subcomponent
public interface ComponentInterface {
     Coffee getCoffee();
     void inject(MainActivity mainActivity);

       @Subcomponent.Builder
       interface  Builder{

          @BindsInstance
          Builder sugar(@Sugar int sugar);
          @BindsInstance
          Builder milk(@Milk int milk);


          ComponentInterface build();
       }


}

