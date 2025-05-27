package com.daniellaera.caffeine_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    public String index() {
        return "Home page!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/test")
    public String test() {
        return "Test page!";
    }

    @GetMapping("/world")
    public String world() {
        return "Test world endpoint!";
    }

    @GetMapping("/caffeine")
    public String test3() {
        return "Test caffeine endpoint! ☕️";
    }

    @GetMapping("/coding")
    public String coding() {
        return "Test coding endpoint! ☕️";
    }
}
