package com.xupt.edu.ttms.mapper;

import com.xupt.edu.ttms.pojo.Employee;
import com.xupt.edu.ttms.pojo.EmployeeExample;
import java.util.List;

public interface EmployeeMapper {
    int deleteByPrimaryKey(Integer emp_id);

    int insert(Employee record);

    int insertSelective(Employee record);

    List<Employee> selectByExample(EmployeeExample example);

    Employee selectByPrimaryKey(Integer emp_id);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}