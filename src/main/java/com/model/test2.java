package com.model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class test2 {
    @RequestMapping("/test2")
    public Map index() {
        Map map = new HashMap();
        map.put("1","1");
        map.put("2",5);
        return map;
    }
}
