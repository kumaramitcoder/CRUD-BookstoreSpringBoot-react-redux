package com.bookstore.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class book {

    @RequestMapping("hello")

    // Method
    public String amit()
    {
        return "Hello Amit";
    }

}
