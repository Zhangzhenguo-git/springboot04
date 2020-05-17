package com.zhang.springboot04;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zhang.springboot04.dao")
public class Springboot04Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot04Application.class, args);
    }

}
