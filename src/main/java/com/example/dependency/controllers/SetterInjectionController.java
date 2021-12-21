package com.example.dependency.controllers;

import com.example.dependency.services.GreetingService;

public class SetterInjectionController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
