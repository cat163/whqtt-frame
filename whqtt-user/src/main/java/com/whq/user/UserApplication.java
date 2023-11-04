package com.whq.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: whq
 * @description: user模块启动类
 * @time: 2023/11/4 17:05
 */
@SpringBootApplication
@MapperScan(value = "com.whq.*.mapper")
@ComponentScan(value = "com.whq")
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class);
    }

}
