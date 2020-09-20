package com.model;

import com.mapper.Test4Mapper;
import com.service.Test4Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test4 {
    //使用mybatis查询数据
    @Autowired
    Test4Service test4Service;
    @RequestMapping("/test4")
    public Object index() {
        return test4Service.getUser();
    }
}
