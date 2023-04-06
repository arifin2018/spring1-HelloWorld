package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String Hello(){
        return "Hello, World!";
    }

    @GetMapping("/bye")
    public String Goodbye(){
        return "Say, Goodbye!";
    }
}