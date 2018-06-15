package com.xupt.edu.ttms.service.impl;

import com.xupt.edu.ttms.mapper.Data_DictMapper;
import com.xupt.edu.ttms.pojo.Data_Dict;
import com.xupt.edu.ttms.service.Data_dictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: zhaowanyue
 * @date: 2018/6/8
 * @description:
 */
@Service
public class Data_DictServiceImpl implements Data_dictService{
    @Autowired
    Data_DictMapper data_dictMapper;
    @Override
    public Data_Dict findById(int dict_id) {
        return  data_dictMapper.selectByPrimaryKey(dict_id);
    }
}
