package com.example.mbttest.repository;

import lombok.*;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * @author zhanghaoyang
 */
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Repository
@Getter
@Setter
public class Question implements Serializable {
    Long id;
    String questionName;
    String questionDescribe;
    User user;
}
