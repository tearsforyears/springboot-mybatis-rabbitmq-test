package com.example.mbttest.controller;

import com.alibaba.fastjson.JSON;
import com.example.mbttest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhanghaoyang
 */
@RestController
public class IndexController {
    @Autowired
    UserService userService;

    @GetMapping("/getInfo")
    public String users() {
        String userInfoJson = JSON.toJSONString(userService.getUserInfos());
        return userInfoJson;
    }

    @GetMapping("/")
    public String index() {
        return "welcome to springboot-mybatis rabbitmq";
    }

    @GetMapping("/index")
    public String index(@RequestParam("name") String name) {
        return "welcome " + name + " to springboot";
    }
}
