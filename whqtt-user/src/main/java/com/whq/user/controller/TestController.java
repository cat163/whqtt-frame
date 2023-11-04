package com.whq.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: whq
 * @description: 测试接口
 * @time: 2023/11/4 17:16
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "test success";
    }

}
