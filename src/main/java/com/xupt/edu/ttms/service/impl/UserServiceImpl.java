package com.xupt.edu.ttms.service.impl;

import com.xupt.edu.ttms.mapper.UserMapper;
import com.xupt.edu.ttms.pojo.User;
import com.xupt.edu.ttms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: zhaowanyue
 * @date: 2018/6/3
 * @description:
 */
@Service
public class UserServiceImpl  implements UserService{
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> lsit() {
        return userMapper.list();
    }
}
