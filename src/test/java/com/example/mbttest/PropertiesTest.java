package com.example.mbttest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
public class PropertiesTest {
//    @Value("#{'${servers}'.split(',')}")
//    List<String> ls;

    @Value("${myservers.list}")
    List<String> test_yml;
//    @Value("${myservers.map}")
//    Object dict;
    @Test
    void test() {
//        System.out.println(dict);
        System.out.println(test_yml);
//        System.out.println(ls.toString() + ls.size());
//        System.out.println(ls.get(0));
    }

}
