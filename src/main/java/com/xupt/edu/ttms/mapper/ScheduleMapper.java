package com.xupt.edu.ttms.mapper;

import com.xupt.edu.ttms.pojo.Schedule;
import com.xupt.edu.ttms.pojo.ScheduleExample;
import java.util.List;

public interface ScheduleMapper {
    int deleteByPrimaryKey(Integer sched_id);

    int insert(Schedule record);

    int insertSelective(Schedule record);

    List<Schedule> selectByExample(ScheduleExample example);

    Schedule selectByPrimaryKey(Integer sched_id);

    int updateByPrimaryKeySelective(Schedule record);

    int updateByPrimaryKey(Schedule record);
}