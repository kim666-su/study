package com.example.testproject.controoler;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstController {

    @GetMapping("/test1")
    public String test1() {

        return "test1";
    }
}