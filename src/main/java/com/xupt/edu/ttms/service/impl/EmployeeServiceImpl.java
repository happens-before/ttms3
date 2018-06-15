package com.xupt.edu.ttms.service.impl;

import com.xupt.edu.ttms.mapper.EmployeeMapper;
import com.xupt.edu.ttms.pojo.Employee;
import com.xupt.edu.ttms.pojo.EmployeeExample;
import com.xupt.edu.ttms.pojo.User;
import com.xupt.edu.ttms.pojo.UserExample;
import com.xupt.edu.ttms.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: zhaowanyue
 * @date: 2018/6/6
 * @description:
 */
@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeMapper employeeMapper;
    @Override
    public List<Employee> list() {
        EmployeeExample employeeExample=new EmployeeExample();
        employeeExample.setOrderByClause("emp_id asc");
        return employeeMapper.selectByExample(employeeExample);
    }

    @Override
    public void add(Employee employee) {
        employeeMapper.insert(employee);
    }

    @Override
    public void delete(int emp_id) {
        employeeMapper.deleteByPrimaryKey(emp_id);
    }

    @Override
    public Employee findById(int emp_id) {
        return employeeMapper.selectByPrimaryKey(emp_id);
    }

    @Override
    public void update(Employee employee) {
        employeeMapper.updateByPrimaryKeySelective(employee);
    }

    @Override
    public boolean isExist(String emp_no) {
        EmployeeExample example =new EmployeeExample();
        example.createCriteria().andEmp_noEqualTo(emp_no);
        List<Employee> result= employeeMapper.selectByExample(example);
        if(!result.isEmpty())
            return true;
        return false;
    }

    @Override
    public List<Employee> search(String keyword) {
        EmployeeExample example = new EmployeeExample();
        example.createCriteria().andEmp_noLike("%" + keyword + "%");
        List<Employee> result = employeeMapper.selectByExample(example);
        return result;
    }

    @Override
    public int findByNo(String emp_no) {
        EmployeeExample example=new EmployeeExample();
        example.createCriteria().andEmp_noEqualTo(emp_no);
        List<Employee> employee=employeeMapper.selectByExample(example);
        return employee.get(0).getEmp_id();
    }
}
