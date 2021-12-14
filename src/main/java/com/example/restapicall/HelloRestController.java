package com.example.restapicall;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloRestController {
    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello from Bridgelabz !!!";
    }
}
