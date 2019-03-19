package com.thom.restdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.thom.dao")
public class RestdemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestdemoApplication.class, args);
        System.out.println("程序正在运行...");
    }



}
