package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "rest")
@RestController
public class TestController {

    @GetMapping("message")
    public String getMessage() {
        return "Hello World!";
    }
}
