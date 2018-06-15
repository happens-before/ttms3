package com.xupt.edu.ttms.service;

import com.xupt.edu.ttms.pojo.User;

import java.util.List;

public interface UserService {
    List<User> list();
    void add(User user);
    void delete(String emp_no);
    User findById(String emp_no);
    void update(User user);
    User get(String emp_no,String emp_pass);
    List<User> search(String keyword);

}
