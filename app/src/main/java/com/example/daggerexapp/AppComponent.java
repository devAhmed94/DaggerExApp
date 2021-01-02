package com.example.daggerexapp;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = Modules.class)
public interface AppComponent {
   ComponentInterface.Builder getComponentInterface();
}
