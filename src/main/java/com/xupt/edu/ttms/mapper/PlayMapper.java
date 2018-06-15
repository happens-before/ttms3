package com.xupt.edu.ttms.mapper;

import com.xupt.edu.ttms.pojo.Play;
import com.xupt.edu.ttms.pojo.PlayExample;
import java.util.List;

public interface PlayMapper {
    int deleteByPrimaryKey(Integer play_id);

    int insert(Play record);

    int insertSelective(Play record);

    List<Play> selectByExample(PlayExample example);

    Play selectByPrimaryKey(Integer play_id);

    int updateByPrimaryKeySelective(Play record);

    int updateByPrimaryKey(Play record);
}