package com.mybatis.mybatisproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.mybatis.mybatisproject")
public class MybatisProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisProjectApplication.class, args);
    }

}
