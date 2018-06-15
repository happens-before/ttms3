package com.xupt.edu.ttms.mapper;

import com.xupt.edu.ttms.pojo.Studio;
import com.xupt.edu.ttms.pojo.StudioExample;
import java.util.List;

public interface StudioMapper {
    int deleteByPrimaryKey(Integer studio_id);

    int insert(Studio record);

    int insertSelective(Studio record);

    List<Studio> selectByExample(StudioExample example);

    Studio selectByPrimaryKey(Integer studio_id);

    int updateByPrimaryKeySelective(Studio record);

    int updateByPrimaryKey(Studio record);
}