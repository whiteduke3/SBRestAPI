package com.example.demo2.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/hello")
@RestController
public class HelloController {

    @GetMapping
    public String hello() {
        return "Hello world!";
    }
}
