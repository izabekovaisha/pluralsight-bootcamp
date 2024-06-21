package com.pluralsight.customerAPI.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(path = "/potato", method = RequestMethod.GET)
    public String index(@RequestParam(defaultValue = "Potato Steel") String name) {
        return "Hello " + name + "!";
    }
}
