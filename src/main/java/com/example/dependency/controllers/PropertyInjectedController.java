package com.example.dependency.controllers;

import com.example.dependency.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;
    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
