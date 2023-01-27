package com.betclient.application;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "Yo Yo Greetings from Spring Boot!";
    }

    @GetMapping("/test")
    public String test() {
        return "TEST: Yo Yo Greetings from Spring Boot!";
    }
}
