package com.bahati.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWordController {

    @GetMapping(path = "/hello")

    public String helloword() {
        return "Hello Morning displine";
    }
}