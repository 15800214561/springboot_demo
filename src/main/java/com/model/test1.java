package com.model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test1 {
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
}
