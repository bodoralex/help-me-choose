package com.codecool.helpmechoose.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HelloWorldController {

    @RequestMapping("")
    public String helloWorld(){
        return "Hello World";
    }
}
