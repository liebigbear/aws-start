package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsController {
    @GetMapping("/hello-world")
    public String helloWorld() {
        return "hello w orld";
    }
}
