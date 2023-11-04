package com.whq.user.service.impl;

import com.whq.user.entity.dto.UserDto;
import com.whq.user.entity.po.UserPo;
import com.whq.user.mapper.UserMapper;
import com.whq.user.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: whq
 * @description:
 * @time: 2023/11/4 20:10
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public int addUser(UserDto userDto) {
        UserPo userPo = new UserPo();
        BeanUtils.copyProperties(userDto, userPo);
        int count = userMapper.insert(userPo);
        return count;
    }

}
