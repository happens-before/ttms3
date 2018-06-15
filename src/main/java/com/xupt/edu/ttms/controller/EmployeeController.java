package com.xupt.edu.ttms.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xupt.edu.ttms.pojo.Employee;
import com.xupt.edu.ttms.service.EmployeeService;
import com.xupt.edu.ttms.util.Page;
import com.xupt.edu.ttms.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author: zhaowanyue
 * @date: 2018/6/6
 * @description:
 */
@Controller
@RequestMapping("")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @RequestMapping("employee_list")
    @ResponseBody
    public List<Employee> list()throws Exception{
        List<Employee> employees= employeeService.list();
        return employees;

    }
    //文件只能用POST方式进行传递
    @RequestMapping(value = "employee_listByPage" ,method = RequestMethod.POST)
    //JSON形式返回给结果
    @ResponseBody
    public  List<Employee> list(Page page, @RequestParam("start") int start, @RequestParam("count") int count){
        page.setStart(start);
        page.setCount(count);
        PageHelper.offsetPage(start,count);
        List<Employee> employees= employeeService.list();
        int total = (int) new PageInfo<>(employees).getTotal();
        page.setTotal(total);
        return employees;
    }
    //    @RequestMapping(value="user_add",method=RequestMethod.GET)
//    @ResponseBody
//    public User add
//            (User user,@RequestParam("emp_no") String emp_no, @RequestParam("emp_pass") String emp_pass,
//             @RequestParam("type")int type,
//             @RequestParam("head_path") String head_Path)
//            throws IOException {
//        user.setEmp_no(emp_no);
//        user.setEmp_pass(emp_pass);
//        user.setType(type);
//        user.setHead_path(head_Path);
//        employeeService.add(user);
//        return user;
//    }
    @RequestMapping(value="employee_add",method=RequestMethod.POST)
    @ResponseBody
    public  String  add(Employee employee,HttpServletResponse response)throws Exception
    {
        employeeService.add(employee);
        JSONObject result=new JSONObject();
        result.put("success","ok");
        ResponseUtil.write(response,result);
        return null;
    }
    @RequestMapping(value="employee_delete", method=RequestMethod.POST)
    @ResponseBody
    public  String  delete(@RequestParam("emp_id") int emp_id, HttpServletResponse response) throws Exception
    {
        employeeService.delete(emp_id);
        JSONObject  result=new JSONObject();
        result.put("success","ok");
        ResponseUtil.write(response,result);
        return null;
    }
    @RequestMapping(value = "employee_findById",method = RequestMethod.POST)
    @ResponseBody
    public Employee findById (@RequestParam("emp_id") int emp_id) throws  IOException{
        Employee employee=employeeService.findById(emp_id);
        return employee;
    }
    @RequestMapping(value="employee_update",method = RequestMethod.POST)
    @ResponseBody
    public String  update(Employee employee) throws IOException {
        employeeService.update(employee);
        return null;
    }
    @RequestMapping(value = "register",method = RequestMethod.POST)
    @ResponseBody
    public String Register(Employee employee,HttpServletResponse response)throws Exception{
        String emp_no =  employee.getEmp_no();
        emp_no = HtmlUtils.htmlEscape(emp_no);
        employee.setEmp_no(emp_no);
        boolean exist = employeeService.isExist(emp_no);
        JSONObject result=new JSONObject();

        if(exist){
            String m ="用户名已经被使用,不能使用";
            result.put("msg", m);
        }
        employeeService.add(employee);
        result.put("msg","注册成功");
        ResponseUtil.write(response,result);
        return null;
    }
    @RequestMapping(value = "employee_search",method = RequestMethod.POST)
    @ResponseBody
    public List<Employee> search( @RequestParam("emp_no") String emp_no){
        List<Employee> employees= employeeService.search(emp_no);
        return employees;
    }
}
