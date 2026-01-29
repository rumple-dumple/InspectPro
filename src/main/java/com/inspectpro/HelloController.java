package com.inspectpro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/home")
    public String hello() {
        return "Welcome to Inspectpro we're up and running!";
    }

    @GetMapping("/about")
    public String about() {
        return "We Welcome you to munchkin land!";
    }
}
