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

    @GetMapping("/viber")
    public String viber() {
        return "Hello Viber!";
    }

    @GetMapping("/test")
    public String test() {
        return "Test page!";
    }

    @GetMapping("/test2")
    public String test2() {
        return "Test page 2!";
    }

    @GetMapping("/test3")
    public String test3() {
        return "Test page 3!";
    }

    @GetMapping("/world")
    public String world() {
        return "Test world endpoint!";
    }

    @GetMapping("/caffeine")
    public String caffeine() {
        return "Test caffeine endpoint! ☕️";
    }

    @GetMapping("/coding")
    public String coding() {
        return "Test coding endpoint! ☕️";
    }
}
