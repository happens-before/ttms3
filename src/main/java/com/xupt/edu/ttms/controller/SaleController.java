package com.xupt.edu.ttms.controller;

import com.xupt.edu.ttms.pojo.Sale;
import com.xupt.edu.ttms.pojo.User;
import com.xupt.edu.ttms.service.EmployeeService;
import com.xupt.edu.ttms.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.crypto.Data;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: zhaowanyue
 * @date: 2018/6/10
 * @description:
 */
@Controller
public class SaleController {
    @Autowired
    SaleService saleService;
    @Autowired
    EmployeeService employeeService;
    @RequestMapping(value = "sale_add",method = RequestMethod.POST)
    @ResponseBody
    public Sale add(Sale sale,@RequestParam("sale_payment")BigDecimal  sale_payment,
                   HttpServletRequest request)
    {
        //User user=(User)session.getAttribute("user");
        HttpSession session = request.getSession();
        User user=(User)session.getAttribute("user");
        String emp_no=user.getEmp_no();
        int emp_id=employeeService.findByNo(emp_no);
        Timestamp time= new Timestamp(System.currentTimeMillis());
        System.out.println(time);
        sale.setEmp_id(emp_id);
        sale.setSale_time(time);
        sale.setSale_payment(sale_payment);
        sale.setSale_change(new BigDecimal("00.00"));
        sale.setSale_type(1);
        sale.setSale_status(1);
        saleService.add(sale);
        return sale;
    }

    @RequestMapping(value = "sale_add1",method = RequestMethod.POST)
    @ResponseBody
    public Sale add(Sale sale,@RequestParam("emp_no") String emp_no,@RequestParam("sale_payment")BigDecimal  sale_payment)
    {
        int emp_id=employeeService.findByNo(emp_no);
        Timestamp time= new Timestamp(System.currentTimeMillis());
        System.out.println(time);
        sale.setEmp_id(emp_id);
        sale.setSale_time(time);
        sale.setSale_payment(sale_payment);
        sale.setSale_change(new BigDecimal("00.00"));
        sale.setSale_type(1);
        sale.setSale_status(1);
        saleService.add(sale);
        return sale;
    }

}
