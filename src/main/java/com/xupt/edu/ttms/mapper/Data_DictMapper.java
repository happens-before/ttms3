package com.xupt.edu.ttms.mapper;

import com.xupt.edu.ttms.pojo.Data_Dict;
import com.xupt.edu.ttms.pojo.Data_DictExample;
import java.util.List;

public interface Data_DictMapper {
    int deleteByPrimaryKey(Integer dict_id);

    int insert(Data_Dict record);

    int insertSelective(Data_Dict record);

    List<Data_Dict> selectByExample(Data_DictExample example);

    Data_Dict selectByPrimaryKey(Integer dict_id);

    int updateByPrimaryKeySelective(Data_Dict record);

    int updateByPrimaryKey(Data_Dict record);
}