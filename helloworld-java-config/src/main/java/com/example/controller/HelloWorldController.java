package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    private String helloWorld;

    @GetMapping("/hello")
    public String getHelloWorld() {
        return helloWorld;
    }
}

