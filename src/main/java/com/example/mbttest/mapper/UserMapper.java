package com.example.mbttest.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mbttest.repository.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author zhanghaoyang
 */
@CacheNamespace
@Component
public interface UserMapper extends BaseMapper<User> {
    /**
     * find all users
     *
     * @return
     */
    @Select("SELECT * FROM user")
    @Results({
            @Result(property = "userName", column = "user_name"),
            @Result(property = "passWord", column = "pass_word")
    })
    List<User> findAll();


    /**
     * @param user
     */
    @Insert("insert into user(user_name,pass_word) values(#{userName},#{passWord})")
    void insertUser(User user);

    @Select("select count(id) from user")
    int countUsers();

    @Select("select * from user where id=#{id}")
    @Results({
            @Result(property = "userName", column = "user_name"),
            @Result(property = "passWord", column = "pass_word")
    })
    User findUserById(Long id);

    @Results({
            @Result(property = "userName", column = "user_name"),
            @Result(property = "passWord", column = "pass_word"),
            @Result(property = "questions", column = "id", many = @Many(select = "com.example.mbttest.mapper.QuestionMapper.findQuestionsByUserId"))
    })
    @Select("select * from user where id=#{id}")
    User findUserQuestionInfoById(Long id);
}
