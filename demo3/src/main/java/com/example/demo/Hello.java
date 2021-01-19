package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/basic")
    public Basic1 basic(@RequestParam(value = "myhero", defaultValue = "World") String myhero) {
        return new Basic1(counter.incrementAndGet(), String.format(template, myhero));
    }
}
