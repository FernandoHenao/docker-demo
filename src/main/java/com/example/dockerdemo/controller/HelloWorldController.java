package com.example.dockerdemo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController
{
    @RequestMapping("/greet")
    public String hello()
    {
        return "Hello javaTpoint";
    }
}