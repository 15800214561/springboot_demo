package com.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class test3 {
    @Value("${properties.username}")
    private String username;
    //自定义Property
    @Value("")
    @RequestMapping("/test3")
    public String index() {
        return this.username;
    }
}
