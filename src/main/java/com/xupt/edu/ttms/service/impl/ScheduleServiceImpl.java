package com.xupt.edu.ttms.service.impl;

import com.xupt.edu.ttms.mapper.PlayMapper;
import com.xupt.edu.ttms.mapper.ScheduleMapper;
import com.xupt.edu.ttms.mapper.StudioMapper;
import com.xupt.edu.ttms.pojo.*;
import com.xupt.edu.ttms.service.PlayService;
import com.xupt.edu.ttms.service.ScheduleService;
import com.xupt.edu.ttms.service.SeatService;
import com.xupt.edu.ttms.service.StudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: zhaowanyue
 * @date: 2018/6/8
 * @description:
 */
@Service
public class ScheduleServiceImpl implements ScheduleService {
    @Autowired
    ScheduleMapper scheduleMapper;
    @Autowired
    StudioService studioService;
    @Autowired
    PlayService playService;
    @Autowired
    SeatService seatService;

    @Override
    public List<Schedule> list(int play_id) {
        ScheduleExample example=new ScheduleExample();
        example.createCriteria().andPlay_idEqualTo(play_id);
        List<Schedule> schedules=scheduleMapper.selectByExample(example);
        setStudio(schedules);
        setPlay(schedules);
        return schedules;
    }
    @Override
    public List<Schedule> list() {
        ScheduleExample example=new ScheduleExample();
        List<Schedule> schedules=scheduleMapper.selectByExample(example);
        setStudio(schedules);
        setPlay(schedules);
        return schedules;
    }
    public void setStudio(List<Schedule> schedules)
    {
        for(Schedule schedule:schedules)
            setStudio(schedule);
    }
    public void setStudio(Schedule schedule)
    {
        int studio_id=schedule.getStudio_id();
        Studio studio=studioService.findById(studio_id);
        schedule.setStudio(studio);
    }
    public void setPlay(List<Schedule> schedules)
    {
        for(Schedule schedule:schedules)
            setPlay(schedule);
    }
    public void setPlay(Schedule schedule)
    {
        int play_id=schedule.getPlay_id();
        Play play=playService.findById(play_id);
        schedule.setPlay(play);
    }
    @Override
    public void add(Schedule schedule) {
        scheduleMapper.insert(schedule);
    }

    @Override
    public void delete(int sched_id) {
        scheduleMapper.deleteByPrimaryKey(sched_id);
    }

    @Override
    public void update(Schedule schedule) {
        scheduleMapper.updateByPrimaryKeySelective(schedule);
    }
}
