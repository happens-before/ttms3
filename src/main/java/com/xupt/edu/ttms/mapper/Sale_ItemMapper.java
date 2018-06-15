package com.xupt.edu.ttms.mapper;

import com.xupt.edu.ttms.pojo.Sale_Item;
import com.xupt.edu.ttms.pojo.Sale_ItemExample;
import java.util.List;

public interface Sale_ItemMapper {
    int deleteByPrimaryKey(Long sale_item_id);

    int insert(Sale_Item record);

    int insertSelective(Sale_Item record);

    List<Sale_Item> selectByExample(Sale_ItemExample example);

    Sale_Item selectByPrimaryKey(Long sale_item_id);

    int updateByPrimaryKeySelective(Sale_Item record);

    int updateByPrimaryKey(Sale_Item record);
}