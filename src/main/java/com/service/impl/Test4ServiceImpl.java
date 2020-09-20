package com.service.impl;

import com.mapper.Test4Mapper;
import com.service.Test4Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class Test4ServiceImpl implements Test4Service {
    @Autowired
    Test4Mapper test4Mapper;
    @Override
    public List<Map> getUser() {
        return test4Mapper.getUser();
    }
}
