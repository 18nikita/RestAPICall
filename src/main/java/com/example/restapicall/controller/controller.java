package com.example.restapicall.controller;

import com.example.restapicall.services.person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class controller {

    @RequestMapping(value="/addPerson", method = RequestMethod.GET)
    public void addPerson() {
        person person = new person();
        person.setName("Nikita");
        System.out.println(person);
    }
}
