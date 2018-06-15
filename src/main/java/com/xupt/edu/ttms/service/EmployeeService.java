package com.xupt.edu.ttms.service;

import com.xupt.edu.ttms.pojo.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> list();
    void add(Employee employee);
    void delete(int emp_id);
    Employee findById(int emp_id);
    void update(Employee employee);
    boolean isExist(String emp_no);
    List<Employee> search(String keyword);
    int findByNo(String emp_no);
}
