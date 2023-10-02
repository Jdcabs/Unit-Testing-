package com.example.demo.controller;

import com.example.demo.service.WelcomeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    private final WelcomeService welcomeService;

    public Home(WelcomeService welcomeService){
        this.welcomeService = welcomeService;
    }

    @GetMapping("/welcome")
    public String greet(@RequestParam(defaultValue = "User") String name) {
        return welcomeService.getWelcomeMessage(name);
    }
}
