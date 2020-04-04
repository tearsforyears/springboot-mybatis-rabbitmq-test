package com.example.mbttest;

import com.example.mbttest.mapper.QuestionMapper;
import com.example.mbttest.mapper.UserMapper;
import com.example.mbttest.repository.User;
import com.example.mbttest.util.SpringContextUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MapperTest {
    @Autowired
    UserMapper userMapper;
    @Autowired
    QuestionMapper questionMapper;


    @Test
    void test() {
        System.out.println(SpringContextUtil.getBean("TestQueue"));
//        System.out.println(userMapper.findAll());
//        User user = new User("pig", "pig");
//        userMapper.insertUser(user);
//        System.out.println(userMapper.countUsers());
//        System.out.println(userMapper.findUserById(1L));
//        System.out.println(questionMapper.findQuestionInfoByUsername("tompig"));
//        System.out.println(questionMapper.findQuestionById(2L));
//        System.out.println(questionMapper.findQuestionsByUserId(1L));
//        System.out.println(userMapper.findUserQuestionInfoById(1L));
    }

}
