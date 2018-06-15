package com.xupt.edu.ttms.mapper;

import com.xupt.edu.ttms.pojo.User;
import com.xupt.edu.ttms.pojo.UserExample;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(String emp_no);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(String emp_no);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}