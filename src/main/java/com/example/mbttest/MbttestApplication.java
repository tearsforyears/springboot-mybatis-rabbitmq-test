package com.example.mbttest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author zhanghaoyang
 */
@SpringBootApplication
@MapperScan("com.example.mbttest.mapper")
public class MbttestApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MbttestApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(MbttestApplication.class, args);
    }

}
