package com.xupt.edu.ttms.service.impl;

import com.xupt.edu.ttms.mapper.UserMapper;
import com.xupt.edu.ttms.pojo.User;
import com.xupt.edu.ttms.pojo.UserExample;
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
    public List<User> list() {
        UserExample example=new UserExample();
        return  userMapper.selectByExample(example);
    }

    @Override
    public void add(User user) {
        userMapper.insert(user);
    }

    @Override
    public void delete(String emp_no) {
        userMapper.deleteByPrimaryKey(emp_no);
    }

    @Override
    public User findById(String emp_no) {
        return userMapper.selectByPrimaryKey(emp_no);
    }

    @Override
    public User get(String emp_no, String emp_pass) {
        UserExample example =new UserExample();
        example.createCriteria().andEmp_noEqualTo(emp_no).andEmp_passEqualTo(emp_pass);
        List<User> result= userMapper.selectByExample(example);
        if(result.isEmpty())
            return null;
        return result.get(0);
    }

    @Override
    public List<User> search(String keyword) {
        UserExample example = new UserExample();
        example.createCriteria().andEmp_noLike("%" + keyword + "%");
        List<User> result = userMapper.selectByExample(example);
        return result;
    }

    @Override
    public void update(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }
}
