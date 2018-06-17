package com.example.demo.service;

import com.example.demo.dao.UserMapper;
import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class TestService {

    @Resource
    UserMapper userMapper;

    public Map x() {

        User u = userMapper.selectByPrimaryKey(1);

        Map r = new HashMap();
        r.put("x",u);
        return r;
    }
}
