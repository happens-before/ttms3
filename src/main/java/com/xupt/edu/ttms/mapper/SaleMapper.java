package com.xupt.edu.ttms.mapper;

import com.xupt.edu.ttms.pojo.Sale;
import com.xupt.edu.ttms.pojo.SaleExample;
import java.util.List;

public interface SaleMapper {
    int deleteByPrimaryKey(Long sale_ID);

    int insert(Sale record);

    int insertSelective(Sale record);

    List<Sale> selectByExample(SaleExample example);

    Sale selectByPrimaryKey(Long sale_ID);

    int updateByPrimaryKeySelective(Sale record);

    int updateByPrimaryKey(Sale record);
}