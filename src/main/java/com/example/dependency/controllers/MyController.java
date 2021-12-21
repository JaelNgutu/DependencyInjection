package com.example.dependency.controllers;

import com.example.dependency.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHi(){


        return greetingService.sayGreeting();
    }

}
