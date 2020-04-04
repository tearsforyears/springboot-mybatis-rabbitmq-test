package com.example.mbttest.service;
import	java.util.HashMap;

import com.example.mbttest.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author zhanghaoyang
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public Map<String,Object> getUserInfos(){
        Map<String,Object> dict = new HashMap<String, Object> ();
        dict.put("users",userMapper.findAll());
        dict.put("numbers",userMapper.countUsers());
        return dict;
    }
}
