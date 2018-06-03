package com.xupt.edu.ttms.controller;

import com.xupt.edu.ttms.pojo.User;
import com.xupt.edu.ttms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author: zhaowanyue
 * @date: 2018/6/3
 * @description:
 */
@Controller
@RequestMapping("")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("user_list")
    public String list(Model model){
        List<User> cs= userService.list();
        model.addAttribute("cs", cs);//填充Jsp代码中的变量
        return "admin/listCategory";
    }
}
