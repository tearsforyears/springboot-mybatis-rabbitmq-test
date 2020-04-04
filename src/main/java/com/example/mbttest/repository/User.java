package com.example.mbttest.repository;

import lombok.*;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;


/**
 * @author zhanghaoyang
 */
@AllArgsConstructor
@ToString
@Repository
@Getter
@Setter
public class User implements Serializable {
    public User(){

    }
    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    private static final long serialVersionUID = 1L;
    Long id;
    String userName;
    String passWord;
    List<Question> questions;

}
