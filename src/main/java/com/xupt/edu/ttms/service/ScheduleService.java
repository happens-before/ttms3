package com.xupt.edu.ttms.service;

import com.xupt.edu.ttms.pojo.Schedule;

import java.util.List;

public interface ScheduleService {
    List<Schedule> list();
    void add(Schedule schedule);
    void delete(int sched_id);
    void update(Schedule schedule);
    List<Schedule> list(int play_id);
}
