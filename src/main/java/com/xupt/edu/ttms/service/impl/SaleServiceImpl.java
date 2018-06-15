package com.xupt.edu.ttms.service.impl;

import com.xupt.edu.ttms.mapper.SaleMapper;
import com.xupt.edu.ttms.pojo.Sale;
import com.xupt.edu.ttms.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: zhaowanyue
 * @date: 2018/6/10
 * @description:
 */
@Service
public class SaleServiceImpl implements SaleService{
    @Autowired
    SaleMapper saleMapper;

    @Override
    public void add(Sale sale) {
        saleMapper.insert(sale);
    }
}
