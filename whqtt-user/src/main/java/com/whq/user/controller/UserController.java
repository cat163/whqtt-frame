package com.whq.user.controller;

import com.whq.user.entity.dto.UserDto;
import com.whq.user.entity.req.UserReq;
import com.whq.user.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author: whq
 * @description: 测试接口
 * @time: 2023/11/4 17:16
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/add")
    public Integer addUser(@RequestBody UserReq userReq) {
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userReq, userDto);
        return userService.addUser(userDto);
    }

}
