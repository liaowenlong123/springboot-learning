package com.lwl.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
public class HelloWorld {

    @RequestMapping("/sayHello")
    public String sayhello(){
        return "Hello World !";
    }

}
