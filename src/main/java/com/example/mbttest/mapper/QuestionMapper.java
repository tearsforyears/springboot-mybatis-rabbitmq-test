package com.example.mbttest.mapper;

import com.example.mbttest.repository.Question;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author zhanghaoyang
 */
@Component
public interface QuestionMapper {
    /**
     * get an question info with properties
     * questionName questionDescribe repository:User
     *
     * @param username
     * @return
     */
    @Select("select * from question q left join user u on q.user_id=u.id where user_name=#{username}")
    @Results({
            @Result(property = "questionName", column = "question_name"),
            @Result(property = "questionDescribe", column = "question_describe"),
            @Result(property = "user", column = "user_id", one = @One(select = "com.example.mbttest.mapper.UserMapper.findUserById"))
    })
    List<Question> findQuestionInfoByUsername(String username);

    @Results({
            @Result(property = "questionName", column = "question_name"),
            @Result(property = "questionDescribe", column = "question_describe"),
    })
    @Select("select * from question where id=#{id}")
    Question findQuestionById(Long id);

    @Results({
            @Result(property = "questionName", column = "question_name"),
            @Result(property = "questionDescribe", column = "question_describe"),
    })
    @Select("select * from question where user_id=#{id}")
    List<Question> findQuestionsByUserId(Long id);
}
